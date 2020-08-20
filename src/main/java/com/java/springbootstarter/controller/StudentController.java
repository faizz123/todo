package com.java.springbootstarter.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootstarter.dvo.Status;
import com.java.springbootstarter.model.StudentEntity;
import com.java.springbootstarter.service.StudentService;

@RestController
@RequestMapping("/student")


public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@CrossOrigin
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addCompany(@RequestBody StudentEntity student){
		studentService.save(student);
		return new Status(1, "Student inserted Successfully !");
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody StudentEntity getPlansById(@PathVariable long id) {
		StudentEntity studentEntity = studentService.findById(id);
		return studentEntity;
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status updateStudent(@PathVariable long id, @RequestBody StudentEntity studentEntity) {

		studentService.update(id, studentEntity);
		return new Status(1, "Student updated Successfully !");
	}
	
	@CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentEntity> findAll() {
		List<StudentEntity> studentList = studentService.findAll();
    	return studentList;
    }
	
	@CrossOrigin
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status deleteStudent(@PathVariable long id) {

		studentService.delete(id);
		return new Status(1, "Student deleted Successfully !");
	}
	
}
