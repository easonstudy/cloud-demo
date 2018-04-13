配置高可用 服务

1：添加eureka客户端
<dependency>
 <groupId>org.springframework.cloud</groupId>
 <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>

2:启动applicaiton添加注解 表示客户端
@EnableDiscoveryClient

3:修改application.properties 指定eureka服务注册中心 地址
eureka.client.serviceUrl.defaultZone=http://localhost:7000/eureka/





