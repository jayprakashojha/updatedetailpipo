package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {

	@Autowired
	private Interface1 interser;
	
	

	public String addData(MultipartFile myFile, String name, String description) throws IOException {
		Product p=new Product();
	    p.setName(name);
	    p.setDescription(description);
	    p.setImage(myFile.getBytes());
		interser.save(p);
		return "image save in database";
	}
}
