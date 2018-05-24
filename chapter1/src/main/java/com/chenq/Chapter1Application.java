package com.chenq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 等同于 （@Controller 与 @ResponseBody）
 */
@SpringBootApplication
@RestController
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}

	@GetMapping("hello")
	public String hello(){
		return "hello world";
	}


	@Bean
	public CommandLineRunner commandLineRunner(){
		return  args ->{
			System.out.println("项目启动的时候初始化");
		};
	}

}
