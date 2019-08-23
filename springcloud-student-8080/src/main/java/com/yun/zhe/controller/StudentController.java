package com.yun.zhe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yun.zhe.entity.Student;
import com.yun.zhe.service.StudentService;

@RestController
public class StudentController {
    
	@GetMapping("/student/get")
	public Student test() {
		return new Student().setName("student:yunzhe");
	}
	
	
}
