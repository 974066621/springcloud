package com.yun.zhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient // 注册到服务中心
public class ZullApplication_80 {

	public static void main(String[] args) {
		SpringApplication.run(ZullApplication_80.class, args);
	}
}
