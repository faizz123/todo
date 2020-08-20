package com.java.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.java.springbootstarter.model.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>, JpaSpecificationExecutor {

}
