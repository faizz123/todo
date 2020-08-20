package com.java.springbootstarter.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable, Cloneable {
	
	
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "STUDENT_ID")
	private Long studentId;
    
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_ADDRESS")
	private String studentAddress;
	

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setCompanyName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setCompanyAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void setId(long id) {
		
	}

      

}
