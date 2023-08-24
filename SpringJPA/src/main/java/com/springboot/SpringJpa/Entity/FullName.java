package com.springboot.SpringJpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FullName {
	
	@Id
	private int studentName;
	private String firstName;
	private String middlename;
	private String lastname;
	
	public int getStudentName() {
		return studentName;
	}
	public void setStudentName(int studentName) {
		this.studentName = studentName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
