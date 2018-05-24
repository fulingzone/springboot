package com.chenq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ChenQuan on 2018/5/24.
 * 实际应用中，我们会有在项目服务启动的时候就去加载一些数据或做一些事情这样的需求。
 为了解决这样的问题，Spring Boot 为我们提供了一个方法，通过实现接口 CommandLineRunner 来实现。
 * Order  注解的执行优先级是按value值从小到大顺序。
 */
@Component
@Order(value = 1)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("服务器启动是，加载数据操作1");
    }
}
