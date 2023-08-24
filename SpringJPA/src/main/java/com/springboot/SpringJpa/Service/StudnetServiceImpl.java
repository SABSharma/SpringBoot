package com.springboot.SpringJpa.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringJpa.Doa.StudentDao;
import com.springboot.SpringJpa.Entity.Student;

@Service
public class StudnetServiceImpl implements StudentService {
     
	@Autowired
	StudentDao studnetDao;
	
	@Override
	public Student findStudnet(int id) {
		// TODO Auto-generated method stub
		Student s=null;
		
		try {
			Optional<Student> findById = studnetDao.findById(id);
			s=findById.get();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ocuured -no such id found");
		}
		
		return s;
	}

	@Override
	public Student addstudnet (Student student) {
		// TODO Auto-generated method stub
		
		Student save = studnetDao.save(student);
		return save;
	}

	@Override
	public Student EditStudent(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> findById = studnetDao.findById(student.getStudentId());
		
		Student save = studnetDao.save(student);
		
		return save;
	}

	@Override
	public String DeleteStudent(int id) {
		// TODO Auto-generated method stub
		
        Student s=null;
		
		try {
			Optional<Student> findById = studnetDao.findById(id);
			s=findById.get();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ocuured -no such id found");
		}
		
		if(s==null) {
			return " NO such student with the given id found";
		}
		
		studnetDao.deleteById(id);
		//System.out.println();
		return "Student Got deleted ";
	}

	

}
