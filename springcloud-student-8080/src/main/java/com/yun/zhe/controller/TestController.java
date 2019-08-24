package com.yun.zhe.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yun.zhe.dao.Student2Dao;
import com.yun.zhe.dao.StudentDao;
import com.yun.zhe.entity.Student;
@RestController
public class TestController {
	
	@Autowired
	StudentDao studentDao;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Student2Dao studentDao2;
	
	@Value("${info.app.name}")
	private String value;
	@GetMapping("/student/get")
	/**
	 * 测试jpa
	 * @return
	 */
	public Student get() {
		Student student=studentDao.findOne(1);
				
		return student;
	}
	//测试是否从配置中心获取到数据
	@GetMapping("/student/info")
	public String info() {
		
		return this.value;
	}
	/**
	 * 测试jdbctemplate
	 * @return
	 */
	@GetMapping("/student/jdbctest")
	public Student testJdbc() {
		String sql="select * from student";
		Map<String ,Object> map=jdbcTemplate.queryForMap(sql);
		map.get("id");
		return new Student().setId((Integer)map.get("id")).setName((String)map.get("name"));
	}
	/**
	 * 测试mybatis
	 * @return
	 */
	@GetMapping("/student/mybatistest")
	public Student testMybatis() {
		Student student=studentDao2.findById(1);
		return student;
	}
	
}
