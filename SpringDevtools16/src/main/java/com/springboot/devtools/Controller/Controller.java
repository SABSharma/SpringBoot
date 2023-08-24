package com.springboot.devtools.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.devtools.Entity.Book;
import com.springboot.devtools.Service.BookService;

@RestController
public class Controller {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/sum")
	@ResponseBody
	public String  sum() {
		int a =10;
		int b=80;
		return "Sum of a and b = " + (a+b);
	}
	
	@GetMapping("/AllBooks")
	public List<Book> AllBooks(){
		List<Book> getallBooks = bookService.getallBooks();
		return getallBooks;
		
	} 
	  
	//With reponseEntity 
	
	@GetMapping("/AllBooksR")
	public ResponseEntity<List<Book>>  AllBooksR(){
		List<Book> getallBooks = bookService.getallBooks();
		if(getallBooks.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(getallBooks) );
		
	} 
	
	
	@GetMapping("/check")
	public String tocheck() {
		return bookService.check();
	}
	
	@GetMapping("/getbyid/{id}")
	public Book getbook(@PathVariable("id") int id) {
		
		return bookService.getspecificBook(id);
	}
	
	
	// GetBookBy id With reponse Entity
	
	@GetMapping("getbyidR/{id}")
	public ResponseEntity<Book> getbookR(@PathVariable ("id") int id){
		
		 Book getspecificBook = bookService.getspecificBook(id);
		
		 if(getspecificBook==null) {
			 
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 
		return ResponseEntity.of(Optional.of(getspecificBook));
		
	}
	
	
	
	@PostMapping("/addbook")
	public void addbook(@RequestBody Book book){
		
		bookService.addbook(book);
	}
	
	

}
