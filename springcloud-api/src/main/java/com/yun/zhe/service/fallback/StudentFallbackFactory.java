package com.yun.zhe.service.fallback;


import org.springframework.stereotype.Component;

import com.yun.zhe.entity.Student;
import com.yun.zhe.service.StudentService;

import feign.hystrix.FallbackFactory;

@Component
public class StudentFallbackFactory implements FallbackFactory<StudentService> {

	public StudentService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new StudentService() {

			public Student test() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

}
