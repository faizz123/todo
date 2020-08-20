package com.java.springbootstarter.service;

import com.java.springbootstarter.model.Todo;

import java.util.List;

public interface ITodoService {
    void save(Todo todo);

    Todo findById(long id);

    List<Todo> findAll();

    void update(long id, Todo todo);

    void delete(long id);
}
