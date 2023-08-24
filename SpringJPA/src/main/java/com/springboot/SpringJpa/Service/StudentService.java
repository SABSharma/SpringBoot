package com.springboot.SpringJpa.Service;

import com.springboot.SpringJpa.Entity.Student;

public interface StudentService {
   
	public Student findStudnet(int id);
	public Student addstudnet(Student student);
	public Student EditStudent(Student student);
	public String DeleteStudent(int id);
}
