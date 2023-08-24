package com.springboot.Practice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Practice.Entity.Mobile;

public interface MobileDao  extends JpaRepository<Mobile, Integer>{

    
}
