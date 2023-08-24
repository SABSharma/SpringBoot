package com.springboot.Practice.Controller;

import java.net.http.HttpResponse;
import java.util.Optional;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Practice.Entity.Mobile;
import com.springboot.Practice.Service.MobileService;
import com.springboot.Practice.Service.MobileServiceImpl;

@RestController
public class Mycontroller {
	
	@Autowired
	private MobileService mobileService;
	
	@GetMapping("/home")
	public String home() {
		return "You are on home page";
	}
	
	@PostMapping("/addmobile")
	public Mobile addmobile(@RequestBody Mobile mobile) {
        Mobile addmobile = mobileService.addmobile(mobile); 
		return addmobile;
		
	}
	
	@DeleteMapping("/deletid/{id}")
	public ResponseEntity<Mobile> deletemobile(@PathVariable int id){
		
		Optional<Mobile> deletemobile = mobileService.deletemobile(id);
		if(deletemobile.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
		return ResponseEntity.of(deletemobile);
		
	}
	
	@DeleteMapping("delete1/{id}")
	public String delete(@PathVariable int id) {
		
		String delete = mobileService.delete(id);
		return delete;
	}

}
