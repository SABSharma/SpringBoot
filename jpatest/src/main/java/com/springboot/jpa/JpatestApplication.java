package com.springboot.jpa;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpa.Dao.UserRepository;
import com.springboot.jpa.entity.User;


@SpringBootApplication
public class JpatestApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(JpatestApplication.class, args);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext();
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setId(12);
//		user.setName("Dheeraj");
//		user.setAddress("Delhi");
		
//		 Save single user
		
//		User save = userRepository.save(user);
//		System.out.println(save);
		
//		User user1 = new User();
//		user1.setId(304);
//		user1.setName("Abhi");
//		user1.setAddress("Delhi");
//		
//		User user2 = new User();
//		user2.setId(305);
//		user2.setName("Pathania");
//		user2.setAddress("Hamirpur");
//		
//		// Save Multiple users
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> saveAll = userRepository.saveAll(users);
//		
//		for( User u: users ) {
//			   System.out.println(u);
//		}
		
		
//		Updating the user
		
		
//		Optional<User> optional = userRepository.findById(12);
//		  User user = optional.get();
//		  user.setName("DheraneUpdate");
//		  
//		  User res = userRepository.save(user);
//		  
//		  System.out.println(res);
		  
		  
		  // Reading the user 
		  Iterable<User> itr = userRepository.findAll();
//		  itr.forEach(user -> {System.out.println(user); } );
		  
//		  userRepository.deleteById(304);
//		  System.out.println("Deleted id ");
		  
//		  itr.forEach(varuser ->{
//			   if(varuser.getName().equals("Pathania"))
//				   userRepository.deleteById(varuser.getId());
//			   
//			  
//		  });
		  
//		  =============================================
//				  User defined query calling
//		  List<User> findbyName = userRepository.findByName("Abhi2");
//		  System.out.println(findbyName);
		  
		  
		  List<User> allUser = userRepository.getAllUser();
		  
		  allUser.forEach( e-> { System.out.println(e); } );
		  
		  System.out.println("=======================");
		  List<User> userByName = userRepository.getUserByName("Abhi");
		  userByName.forEach( e-> { System.out.println(e); } );
		  
		  
	}

}
