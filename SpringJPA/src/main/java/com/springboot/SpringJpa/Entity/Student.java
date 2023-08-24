package com.springboot.SpringJpa.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private  int  studentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private FullName fullName;
	
	private String studentAge;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	
	
	public Student(int studentId, FullName fullName, String studentAge) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.studentAge = studentAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", studentAge=" + studentAge + "]";
	}
	
	
	

}
