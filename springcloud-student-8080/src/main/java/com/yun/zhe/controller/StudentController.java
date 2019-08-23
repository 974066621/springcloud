package com.yun.zhe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yun.zhe.entity.Student;
import com.yun.zhe.service.StudentService;

@RestController
public class StudentController {
    @Value("${info.app.name}")
	private String value;
	@GetMapping("/student/get")
	public Student test() {
		return new Student().setName("student:yunzhe");
	}
	@GetMapping("/student/info")
	public String info() {
		
		return this.value;
	}
}
