package com.yun.zhe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yun.zhe.dao.StudentDao;
import com.yun.zhe.entity.Student;
@RestController
public class StudentController {
	
	@Autowired
	StudentDao studentDao;
    @Value("${info.app.name}")
	private String value;
	@GetMapping("/student/get")
	public Student get() {
		Student student=studentDao.findOne(1);
		return student;
	}
	@GetMapping("/student/info")
	public String info() {
		
		return this.value;
	}
}
