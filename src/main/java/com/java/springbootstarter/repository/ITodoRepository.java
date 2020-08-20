package com.java.springbootstarter.repository;

import com.java.springbootstarter.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ITodoRepository extends JpaRepository<Todo, Long>, JpaSpecificationExecutor {
}
