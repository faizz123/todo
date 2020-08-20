package com.java.springbootstarter.serviceimpl;

import com.java.springbootstarter.model.Todo;
import com.java.springbootstarter.repository.ITodoRepository;
import com.java.springbootstarter.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceimpl implements ITodoService {
    @Autowired
    private ITodoRepository todoRepository;
    @Override
    public void save(Todo todo)
    {
        todoRepository.save(todo);
    }

    @Override
    public Todo findById(long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public List<Todo> findAll() {
      return todoRepository.findAll();
    }

    @Override
    public void update(long id, Todo todo)
    {
        todoRepository.findById(id);
        todo.setTodoId(id);
        save(todo);
    }

    @Override
    public void delete(long id) {
        todoRepository.deleteById(id);
    }
}
