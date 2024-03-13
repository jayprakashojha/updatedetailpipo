package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	@GetMapping("/get")
	public String getStd()
	{
		return"Hello India";
	}
	
	
}
