package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	/*@RequestMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("name", "success");
		return "index";
	}*/
	@RequestMapping("/Home")
	public String Home()
	{
		return "Home";
	}

}
