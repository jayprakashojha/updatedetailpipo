package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controller1 {

	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/registration")
	public String registration()
    {
		
		return "registration";
    }	
	
	@RequestMapping("/guna")
	public String guna()
    {
		
		return "guna";
    }	
}
