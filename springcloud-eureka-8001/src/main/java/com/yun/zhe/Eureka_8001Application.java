package com.yun.zhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // 开启服务注册 ，服务端
public class Eureka_8001Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Eureka_8001Application.class, args);
	}
}
