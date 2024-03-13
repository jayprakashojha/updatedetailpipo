package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class Contrller1 {

	@RequestMapping("index")
	public String index()
	{
		return "index";
	}
	@PostMapping("/somePostAction")
	public String somePostAction(Model model, RedirectAttributes redirAttrs) {
	   
	        redirAttrs.addFlashAttribute("error", "The error XYZ occurred.");
	        return "redirect:/settings/";
	    }
	   
	  
	@GetMapping("/")
	public String index(Model model) {
	    return "settings/index";
	}
}
