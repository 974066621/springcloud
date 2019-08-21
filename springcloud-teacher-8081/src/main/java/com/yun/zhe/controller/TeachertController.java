package com.yun.zhe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yun.zhe.entity.Student;
import com.yun.zhe.service.StudentService;

@RestController
public class TeachertController {
  @Autowired
  StudentService studentService;
	  @GetMapping("/teacher/get")
	  public Student get() {
		
		
      return studentService.test();
	}
	
}
