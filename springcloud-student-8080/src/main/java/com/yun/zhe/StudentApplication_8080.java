package com.yun.zhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.yun.zhe.entity")
@ComponentScan(basePackages = "com.yun.zhe")
@EnableEurekaClient
@EnableDiscoveryClient
public class StudentApplication_8080 {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication_8080.class, args);
	}
}
