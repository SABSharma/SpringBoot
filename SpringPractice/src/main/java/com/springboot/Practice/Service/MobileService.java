package com.springboot.Practice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.Practice.Entity.Mobile;


public interface MobileService {
	
	public Mobile addmobile(Mobile mobile);
	
	public Optional<Mobile> deletemobile(int id);
	public  String delete(int id);

	public List<Mobile> getallMObiles();
		
	

}
