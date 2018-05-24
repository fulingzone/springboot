package com.chenq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ChenQuan on 2018/5/24.
 */
@Component
@Order(value = 2)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("服务器启动是，加载数据操作2");
    }
}
