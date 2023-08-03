package com.springboot.Fileuploading.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.Fileuploading.helper.Fileuploadhelper;

@RestController
public class MyController {
	
	@Autowired
	private Fileuploadhelper fileuploadhelper;
	
	
	
	@PostMapping("/Upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file){
		
		try {
			System.out.println(file.getName());
			System.out.println(file.getContentType());
			System.out.println(file.getOriginalFilename());
			System.out.println(file.isEmpty());
			System.out.println("helo hy whyty ");
			
			boolean uploadfile = fileuploadhelper.uploadfile(file);
			
			if(uploadfile) {
				//return ResponseEntity.ok("FileUploaded successfuly");
				
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
		
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NO File uploades");
	}

}
