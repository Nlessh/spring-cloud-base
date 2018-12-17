![springcloud.png](springcloud.png)
# spring-cloud-base介绍
spring-cloud-base 是一个基于Spring Cloud的 基础框架示例。
## 技术版本介绍

| 项 | 版本 |  
| :---- |:----| 
| JDK | 1.8 | 
| SpringBoot | - | 
| SpringCloud | Finchley.M9 | 

## 技术栈

| 技术栈 | 说明 |  
| :---- |:----| 
| Consul | 服务注册和发现 | 
| Apollo | 分布式服务配置中心 | 
| Spring Cloud OAuth2 | 包括 Spring OAuth2 和 Spring Boot Security，为微服务提供一整套的安全解决方案 | 
| Feign | 声明式服务调用，用于消费服务 | 
| Ribbon | 负载均衡 | 
| Hystrix | 熔断器 | 
| Hystrix Dashboard | 熔断器仪表板，用于监控熔断器的状况 | 
| Turbine | 聚合多个Hystrix Dashboard | 
| Spring Cloud Sleuth | 集成Zipkin，用于服务链路追踪 | 
| Spring Boot Admin | 聚合监控微服务的状况 | 
| Kong | 服务网关，用于服务智能路由，负载均衡 | 
| Swagger | API接口文档组件 | 
| RabbitMQ | 消息服务器，用于发送日志消息，可以用ELK替代 | 

## 模块介绍

| 模块 | 简介 | 
| ---- |:----|
| bestpractices | 最佳实践（脚手架）项目 | 
| consumer | 消费者 | 
| gateway | 网关 | 
| log | 统一日志 | 
| monitor | 监控 | 
| oauth | 认证、授权 | 
| producer | 生产者 | 
| sql | sql文件目录 | 
| uaa | 认证授权 | 


