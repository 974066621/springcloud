package com.yun.zhe.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.yun.zhe.entity.Student;
import com.yun.zhe.service.fallback.StudentFallbackFactory;

@FeignClient(
		value = "springcloud-student-8080",   //对应微服务的名字
		fallbackFactory = StudentFallbackFactory.class
		)
public interface StudentService {

	@GetMapping("/student/get")
	public Student test();
}
