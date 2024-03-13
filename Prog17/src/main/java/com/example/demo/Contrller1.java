package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contrller1 {

	@RequestMapping("/")
	public String home(Model model)
	{
		 
		 model.addAttribute("name", "Registration successfully Done");
		return "home";
	}
	
	@RequestMapping("/district")
	public String district()
	{
		return "district";
	}
	
	@RequestMapping("/send")
	public String send(@RequestParam String t1)
	{
		System.out.println(t1);
		return "home";
	}
	  
	    @GetMapping("/hello")
	    public String hello(Model model, @RequestParam(value="t1", required=false, defaultValue="World") String name) {
	        name="Registration successfully Done";
	       
	    	model.addAttribute("name", "Registration successfully Done");
	        return "hello";
	    }


}
 