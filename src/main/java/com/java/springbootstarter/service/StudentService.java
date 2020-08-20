package com.java.springbootstarter.service;

import java.util.List;

import com.java.springbootstarter.model.StudentEntity;

public interface StudentService {

	void save(StudentEntity student);

	StudentEntity findById(long id);

	List<StudentEntity> findAll();

	void update(long id, StudentEntity studentEntity);

	void delete(long id);

}
