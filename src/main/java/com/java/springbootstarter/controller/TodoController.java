package com.java.springbootstarter.controller;

import com.java.springbootstarter.dvo.Status;
import com.java.springbootstarter.model.Todo;
import com.java.springbootstarter.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private ITodoService todoService;

    @CrossOrigin
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addCompany(@RequestBody Todo todo){
        todoService.save(todo);
        return new Status(1, "Record inserted Successfully !");
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Todo getPlansById(@PathVariable long id) {
        Todo todo = todoService.findById(id);
        return todo;
    }


    @CrossOrigin
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Status updateStudent(@PathVariable long id, @RequestBody Todo todo) {

        todoService.update(id, todo);
        return new Status(1, "Record updated Successfully !");
    }

    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Todo> findAll() {
        List<Todo> todoList = todoService.findAll();
        return todoList;
    }

    @CrossOrigin
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Status deleteStudent(@PathVariable long id) {

        todoService.delete(id);
        return new Status(1, "Record deleted Successfully !");
    }

}
