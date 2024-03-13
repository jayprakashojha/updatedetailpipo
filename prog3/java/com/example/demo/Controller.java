package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	@PostMapping("/inser")
	public String inser(@RequestParam String text1,@RequestParam Integer text2)
	{
	System.out.println(text1+"" +text2);
	Product p=new Product();
	p.setName(text1);
	p.setAge(text2);
	service.saveProduct(p);
	
		return "index";
	}
}
