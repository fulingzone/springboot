# 简介
## 什么是Spring Boot
Spring Boot其设计目的是用来简化spring应用的初始化和开发过程。Spring Boot的目的不是为了已解决问题提供新方案，而是给开发和平台带来另外一种体验。springboot充分利用了Javaconfig的配置模式以及“约定优于配置”的理念，极大简化springmvc的web应用和resetfull开发，对于Java开发来说，springboot是一个很好的选择。
## 为什么选择springboot
- springboot使编码变的简单
- springboot使配置变的简单
- springboot使部署变的简单
- springboot使监控变的简单
# 相关知识
## 开箱即用
Spring Boot的spring-boot-starter
Spring Boot提供了很多”开箱即用“的依赖模块，都是以spring-boot-starter-xx作为命名的。下面列举一些常用的模块。

spring-boot-starter-logging ：使用 Spring Boot 默认的日志框架 Logback。
spring-boot-starter-log4j ：添加 Log4j 的支持。
spring-boot-starter-web ：支持 Web 应用开发，包含 Tomcat 和 spring-mvc。
spring-boot-starter-tomcat ：使用 Spring Boot 默认的 Tomcat 作为应用服务器。
spring-boot-starter-jetty ：使用 Jetty 而不是默认的 Tomcat 作为应用服务器。
spring-boot-starter-test ：包含常用的测试所需的依赖，如 JUnit、Hamcrest、Mockito 和 spring-test 等。
spring-boot-starter-aop ：包含 spring-aop 和 AspectJ 来支持面向切面编程（AOP）。
spring-boot-starter-security ：包含 spring-security。
spring-boot-starter-jdbc ：支持使用 JDBC 访问数据库。
spring-boot-starter-redis ：支持使用 Redis。
spring-boot-starter-data-mongodb ：包含 spring-data-mongodb 来支持 MongoDB。
spring-boot-starter-data-jpa ：包含 spring-data-jpa、spring-orm 和 Hibernate 来支持 JPA。
spring-boot-starter-amqp ：通过 spring-rabbit 支持 AMQP。
spring-boot-starter-actuator ： 添加适用于生产环境的功能，如性能指标和监测等功能。


## Java Config 自动配置
Spring Boot 推荐采用基于 Java Config 的配置方式，而不是传统的 XML。例如，@Configuration、@Bean、@EnableAutoConfiguration、@CompomentScan、@PropertySource、@Repository、@Service、@RestController等。


# Spring Boot 启动加载数据 CommandLineRunner
实际应用中，我们会有在项目服务启动的时候就去加载一些数据或做一些事情这样的需求。
为了解决这样的问题，Spring Boot 为我们提供了一个方法，通过实现接口 CommandLineRunner 来实现
```
package org.springboot.sample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月9日
 */
@Component
public class MyStartupRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }

}
```


# 自定义控制banner内容
Spring Boot启动的时候默认的banner是spring的字样，看多了觉得挺单调的，Spring Boot为我们提供了自定义banner的功能。

自定义banner只需要在resource下新建一个banner.txt文件，将我们需要的banner字样放进去，启动的时候就会去读取使用这个文本文件中的banner。

比如：

```
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG
```
