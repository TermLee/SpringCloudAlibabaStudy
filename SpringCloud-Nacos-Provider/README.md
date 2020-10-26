#Nacos
`https://spring-cloud-alibaba-group.github.io/github-pages/hoxton/en-us/index.html#_spring_cloud_alibaba_nacos_discovery
`

Nacos作为较新的服务注册与发现组件。可以替代eureka实现服务注册与发现，并整合了Ribbon，能够实现集群服务负载均衡

###1.导入依赖
```xml
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
```
###配置注册中心地址（注册中心先启动才能启动成功）
```yaml
spring:
  application:
    name: nacos-provider
  cloud:
    nacos:
      discovery:
        server-addr: localhost:8848

management:
  endpoints:
    web:
      exposure:
        include: '*'
```
###主启动类添加注解@EnableDiscoveryClient