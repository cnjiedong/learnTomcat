/**
 * @(#) WebApplication.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding;

import com.dtyunxi.listener.AppStartedListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * springBoot启动类
 * Created by ding.wenhui on 2017/12/8.
 */
//排除自动注入数据源
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//自动注入数据源(需要连接数据库)
//@SpringBootApplication
@ComponentScan(basePackages={ "com.yingzi.center.breeding","com.dtyunxi.huieryun"})
@ImportResource("classpath*:config/rpc/*.xml")
public class WebApplication extends SpringBootServletInitializer {
    private AppStartedListener appStartedListener;

    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("application start up");
        appStartedListener = new AppStartedListener(servletContext);
        super.onStartup(servletContext);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass()).listeners(this.getAppStartedListener());
    }

    public AppStartedListener getAppStartedListener() {
        return appStartedListener;
    }
}