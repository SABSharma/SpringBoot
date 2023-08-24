package com.springboot.devtools.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.devtools.Entity.Book;

@Component
public class BookService {
	
	 private static List<Book> books = new ArrayList<>();
	 
	 static {
		 books.add(new Book( 1, "java" , "xyz"));
		 books.add(new Book(2,"Python" ,"robert"));
		 books.add(new Book(3,"C++" ,"robe"));
	 }
	 
	 public List<Book> getallBooks(){
		 return books;
	 }
	 
	 public String  check() {
		 
		 return "Working fine";
	 }
	 
	 public Book getspecificBook( int id ){
		 Book book =null;
		 try {
		 book = books.stream().filter(e-> e.getId()==id).findFirst().get();
		 
		 }
		 
		 catch (Exception e) {
//			e.printStackTrace();
			 System.out.println("No such Book present with the given Id");
		}
		 return book;
		 
	 }
	 
	 // Adding the Book
	 public void addbook(Book b) {
		books.add(b);
		 
	 }

}
