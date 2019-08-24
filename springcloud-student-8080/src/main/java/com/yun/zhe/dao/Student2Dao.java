package com.yun.zhe.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yun.zhe.entity.Student;

@Mapper
public interface Student2Dao {
  
	public Student findById(Integer id);
	
}
