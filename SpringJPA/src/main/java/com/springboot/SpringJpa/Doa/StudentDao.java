package com.springboot.SpringJpa.Doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringJpa.Entity.Student;

public interface StudentDao  extends JpaRepository<Student, Integer>{

}
