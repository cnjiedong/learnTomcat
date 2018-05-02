交易示例

一、命名规范
1. 所有扩展的接口、接口实现均带Biz区分
2. 基础配置，如数据库配置等的类名、bean名也以Biz区分
3. 缓存服务的bean名需与中心一致，需要以center开头，与newretail的命名保持一致(newretail的命名规则  center+服务中心名称+组件服务名称+service)

二、配置中心配置项
host文件的配置:
C:\Windows\System32\drivers\etc
127.0.0.1       jmenv.tbsite.net

Group:
yingzi-dev

DataId:
数据库：key-value
yundt.yingzi.bc.datasourcevo

#test 环境
{
  "validationQuery": "SELECT 1",
  "driverClassName": "com.mysql.jdbc.Driver",
  "jdbcUrl": "jdbc:mysql://drds92of41bn9r2n.drds.aliyun.boc/poc_test?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true",
  "jdbcUserName": "poc_test",
  "jdbcUserPassword": "poc_test_1",
  "initialSize": "1",
  "maxActive": "5",
  "minIdle": "0",
  "maxWait": "60000"
}

#dev 环境
{
  "validationQuery": "SELECT 1",
  "driverClassName": "com.mysql.jdbc.Driver",
  "jdbcUrl": "jdbc:mysql://drds92of41bn9r2n.drds.aliyun.boc/breeding_dev?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true",
  "jdbcUserName": "breeding_dev",
  "jdbcUserPassword": "Breeding_dev123",
  "initialSize": "1",
  "maxActive": "5",
  "minIdle": "0",
  "maxWait": "60000"
}

环境变量 key-value
huieryun.active.profile
dev

缓存 配置 key-value
huieryun.cacheregistryvo
{"port":"6379","appId":"","host":"172.18.20.224","livetime":"86370","type":"REDIS","appSecret":""}

oss 文件服务器配置 key-value
huieryun.ossregistryvo
{"accessKeyId":"LTAIkYW69vIaEBgi",
"endpoint":"https://nuskin-lto-qa.oss-cn-shanghai.aliyuncs.com",
"accessKeySecret":"pKAuEoxZPSQwPGGNw5ecWWoCXOa02k",
"ossType":"ALIYUNOSS",
"subAccessKeyId":"LTAIkYW69vIaEBgi",
"subAccessKeySecret":"pKAuEoxZPSQwPGGNw5ecWWoCXOa02k",
"bucketName":"nuskin-lto-qa",
"roleArn":"acs:ram::1254098803125627:role/OSSRW"
}

oss 文件本地路径配置 key-value
huieryun.objectstorage.simpleobjectstorage.filehome
/home/dtyunxi/fileupload



三、服务启动参数(供参考)
-Dpandora.location=D:\dev\taobao-tomcat-7.0.59\deploy\taobao-hsf.sar
-Ddtyunxi.registry.group=yingzi-dev
-Dyingzi.service.group=yingzi-dev
-Dfile.encoding=UTF-8
-Dyingzi.service.version=0.1.0
-Dhuieryun.active.profile=dev
-Dyingzi.env.logger.level=info

四、HSF配置
1. 所有包名以 "com.yingzi.app. + 应用名"  开头
2.数据源配置：
	BcDataSourceConfig.java -> 
	DataSourceVo dataSourceVo = bcAppRegistryService.getObject("yundt.yingzi.bc.datasourcevo", DataSourceVo.class); --通过edas配置中心获取配置信息,其中"yingzi.bc.datasourcevo"为在edas配置中心配置的 dataid

3.HSF配置
    3.1 应用服务yingzi-app-breeding：
	    controller 层 BreedSetController.java  ，接收前台页面请求，调用service层处理请求
	    service    层 BreedSetServiceImpl.java， 处理请求，如需处理和数据库交互，通过调用data层的api接口来完成
	    data       层 通过edas配置中心获取中心服务的调用地址，然后通过HSF框架调用中心服务提供的api接口 IQueryBreadSetApi，
	 
     HSF配置文件路径：r额、resources/config/rpc/*.xml
     使用中心服务的api接口，
    <bean id="queryBreadSetApi" class="${yingzi.service.consumer}"
          init-method="init">
         <!-- 服务名，与服务提供者的相应配置对应，HSF 将根据 interface + version 查询并订阅所需服务  -->
        <property name="interfaceName" value="com.yingzi.center.breeding.api.query.IBreadSetQueryApi" /> 
        <!-- 版本号，与服务提供者的相应配置对应，HSF 将根据 interface + version + group 查询并订阅所需服务  -->
        <property name="version" value="${yingzi.service.version}" />  
        <!-- 分组号，与服务提供者的相应配置对应，HSF 将根据 interface + version + group 查询并订阅所需服务  -->
        <property name="group" value="${yingzi.service.group}" /> 
        <property name="clientTimeout" value="60000" />
    </bean>
    
   变量来源
    ${yingzi.service.version}、${yingzi.service.group} 分别由项目启动参数(在tomcat server配置中的 VM options选项)提供
    -Dyingzi.registry.group=yingzi-dev
    -Dyingzi.service.group=yingzi-dev
   其中interfaceName、version、group 需要与中心服务配置的 serviceInterface、serviceVersion、serviceGroup 保证一致
    
   3.2 中心服务对外提供API配置
    配置文件位置路径： WebApplication.java -> @ImportResource("classpath*:config/rpc/*.xml")
    配置文件例子（class是固定的,来源于阿里的HSF基础类)：
    
   <bean id="hsfIQueryBreadSetApi" class="${dtyunxi.service.provider}" init-method="init">
        <property name="serviceInterface" value="com.yingzi.center.breeding.api.query.IBreadSetQueryApi" />
        <property name="serviceVersion" value="${yingzi.service.version}" />
        <property name="serviceGroup" value="${yingzi.service.group}" />
        <property name="target" ref="breedSetService" />
    </bean>
    
    
   com.yingzi.center.breeding.api.query.IDemoQueryApi 为对外提供的 interface。通过实现这个接口，实现接口逻辑。
   
 4.日志配置：
  resources/logback-spring.xml
  
五、注意事项
    1.app项目 的tomcat的Deployment中，Application Context 的根路径,必须设置为空或者"/"
    1.ccenter项目 的tomcat的Deployment中，Application Context 的根路径,不允许为空