package com.springboot.SpringJpa.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringJpa.Entity.Student;
import com.springboot.SpringJpa.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studnetService;
	
	@GetMapping("/student/{id}")
	public Student findstudentbyid(@PathVariable int id) {
		
		
		Student findStudnet = studnetService.findStudnet(id);
		//if()
		
		
		return findStudnet;
	}
	
	@PostMapping("/addstudnet")
	public Student addStudent(@RequestBody Student student) {
		Student addstudnet = studnetService.addstudnet(student); 
		return addstudnet;
			
		}
	
	@PutMapping("/editstudent")
	public ResponseEntity<Student> editstudent(@RequestBody Student student){
		Student editStudent = studnetService.EditStudent(student);
		if(editStudent==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(editStudent));
		
	}
		
	
	@DeleteMapping("/DletedStudent/{id}")
	public String Deletestudent(@PathVariable int id) {
		
		
		String deleteStudent = this.studnetService.DeleteStudent(id);
		return deleteStudent;
	}
	        
	}
	


