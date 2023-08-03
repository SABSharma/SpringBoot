package com.springboot.Fileuploading.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Fileuploadhelper {
	
	// Static Path
	//final public String UPLOAD_DIR="C:\\Users\\abhishek.sharma10\\Documents\\SpringBoot\\FileUploading\\src\\main\\resources\\static\\images";
	
	//Dynamic Path
	final public String UPLOAD_DIR=new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public Fileuploadhelper() throws IOException {
		
	}
	
	
	public boolean uploadfile(MultipartFile file) {
		boolean b= false;
		try {
			Files.copy(file.getInputStream(),Paths.get(UPLOAD_DIR +File.separator + file.getOriginalFilename())  , StandardCopyOption.REPLACE_EXISTING);
			b=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return b;
	}
	
	
	
	

}
