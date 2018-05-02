///**
// * @(#) CenterItemCmptDataSourceConfig.java 1.0 2017-09-13
// * Copyright (c) 2017, YUNXI. All rights reserved.
// * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
// */
//package com.dtyunxi.yingzi.center.breeding.config;
//
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// * 描述
// *
// * @author 风行
// * @since 0.5.0
// */
//@Configuration
//@EnableTransactionManagement
//@MapperScan(basePackages = {
//        "com.dtyunxi.yingzi.center.breeding.mapper"
//}, sqlSessionFactoryRef = "centerBreedingSqlSessionFactoryBean")
//public class CenterBreedingDataSourceConfig {
//}
package com.yingzi.center.breeding.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dtyunxi.huieryun.registry.api.IRegistryService;
import com.dtyunxi.huieryun.registry.api.RegistryServiceFactory;
import com.dtyunxi.huieryun.registry.vo.DataSourceVo;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;


@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.yingzi.center.breeding.mapper"
}, sqlSessionFactoryRef = "bcSqlSessionFactoryBean")
@PropertySource({ "classpath:config/config.properties" })

public class CenterBreedingDataSourceConfig  {
    private static final Logger logger = LoggerFactory.getLogger(CenterBreedingDataSourceConfig.class);

    @Autowired
    private Environment bcAppEnvironment;
    @Autowired
    private IRegistryService bcAppRegistryService;

    @Bean(name = "bcDataSource", destroyMethod = "close")
    public DataSource bcDataSource() throws SQLException {
        String s1 = bcAppRegistryService.get("huieryun.objectstorage.simpleobjectstorage.filehome");
        String s2 = bcAppRegistryService.get("yundt.yingzi.bc.datasourcevo");

        DataSourceVo dataSourceVo = bcAppRegistryService.getObject("yundt.yingzi.bc.datasourcevo", DataSourceVo.class);
        logger.debug("Set data source as {}", dataSourceVo);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSourceVo.getJdbcUrl());
        dataSource.setUsername(dataSourceVo.getJdbcUserName());
        dataSource.setPassword(dataSourceVo.getJdbcUserPassword());
        // 初始化连接大小
        dataSource.setInitialSize(dataSourceVo.getInitialSize());
        // 连接池最大使用连接数量
        dataSource.setMaxActive(dataSourceVo.getMaxActive());
        // 连接池最小空闲
        dataSource.setMinIdle(dataSourceVo.getMinIdle());
        // 获取连接最大等待时间
        dataSource.setMaxWait(dataSourceVo.getMaxWait());
        dataSource.setValidationQuery(dataSourceVo.getValidationQuery());
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setTestWhileIdle(true);
        // 间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        // 一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(25200000);
        dataSource.setRemoveAbandoned(true);
        // 1800秒，也就是30分钟
        dataSource.setRemoveAbandonedTimeout(1800);
        // 关闭abanded连接时输出错误日志
        dataSource.setLogAbandoned(true);
        // 监控数据库
        dataSource.setFilters("mergeStat");
        //dataSource.setConnectionInitSqls(Lists.newArrayList("set names utf8mb4;"));

        dataSource.init();

        return dataSource;
    }

    @Bean(name = "bcSqlSessionFactoryBean")
    public SqlSessionFactory orderSqlSessionFactoryBean(@Qualifier("bcDataSource") DataSource bcDataSource) throws Exception {
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setMapUnderscoreToCamelCase(true);
        config.setLogImpl(Slf4jImpl.class);
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(bcDataSource);
        sqlSessionFactoryBean.setConfiguration(config);
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        properties.setProperty("reasonable", "false");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        //添加分页插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSourceTransactionManager bcDataSourceTransactionManager(@Qualifier("bcDataSource") DataSource tradeDataSource) {
        return new DataSourceTransactionManager(tradeDataSource);
    }

    private DruidDataSource createDruidDataSource(DataSourceVo dataSourceConfigVo) throws SQLException{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSourceConfigVo.getJdbcUrl());
        dataSource.setUsername(dataSourceConfigVo.getJdbcUserName());
        dataSource.setPassword(dataSourceConfigVo.getJdbcUserPassword());
        dataSource.setInitialSize(dataSourceConfigVo.getInitialSize()); // 初始化连接大小
        dataSource.setMaxActive(dataSourceConfigVo.getMaxActive()); // 连接池最大使用连接数量
        dataSource.setMinIdle(dataSourceConfigVo.getMinIdle()); // 连接池最小空闲
        dataSource.setMaxWait(dataSourceConfigVo.getMaxWait()); // 获取连接最大等待时间
        dataSource.setValidationQuery(dataSourceConfigVo.getValidationQuery());
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setTestWhileIdle(true);
        dataSource.setTimeBetweenEvictionRunsMillis(60000); // 间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(25200000); // 一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(1800); // 1800秒，也就是30分钟
        dataSource.setLogAbandoned(true); // 关闭abanded连接时输出错误日志
        dataSource.setFilters("mergeStat"); // 监控数据库
        dataSource.setConnectionInitSqls(Lists.newArrayList("set names utf8mb4;"));// 支持emoj特殊字符
        dataSource.init();
        return dataSource;
    }


    @Bean(name = "bcAppRegistryService")
    public IRegistryService bcAppRegistryService() {
        return RegistryServiceFactory.createRegistryService(bcAppEnvironment);
    }
}

