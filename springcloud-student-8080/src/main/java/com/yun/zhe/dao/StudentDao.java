package com.yun.zhe.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.yun.zhe.entity.Student;
@Repository
public interface StudentDao extends PagingAndSortingRepository<Student, Integer> {

}
