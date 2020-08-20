package com.java.springbootstarter.dvo;

import java.io.Serializable;

public class StudentVo implements Serializable {
	
	
private static final long serialVersionUID = 1L;
	
	private Long studentId;
	private String studentName;
	private String studentAddress;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
		
      
        

}
