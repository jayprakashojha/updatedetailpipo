package com.example.demo;


import java.io.IOException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController


public class Controller {

	@Autowired
	private ProductService service;

	@RequestMapping("/index")
	public String index()
	{
		return ("index");
	}
	@PostMapping("/savedata")
	public String savesata(@RequestParam("file") MultipartFile myFile,
			@RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException
	{
		System.out.println(name);
		return service.addData(myFile,name,description);
		
	}
		
}
