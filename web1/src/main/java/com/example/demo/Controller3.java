package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("Message")
public class Controller3 {

	
	
	@RequestMapping("/index")
	public String showIndex(Model model,HttpSession session)
	{
		
		 return "index";
		}
		
		
	
	
	@RequestMapping("/welcome")
	public String welcome(Model model, RedirectAttributes ra,HttpSession session)
	{
		try
		{
		session.setAttribute("message", "message sucessfully");
		
		 return "welcome";
		}
		catch(Exception e)
		{
			session.setAttribute("message", new Message("something went wrong","danger"));
		return "welcome";
		}
	}
	
	
	
	@RequestMapping("/district")
	public String district(Model model,RedirectAttributes ra)
	{
		try
		{
		ra.addFlashAttribute("success", "Everything went just fine.");
		ra.addFlashAttribute("flashSuccessMsg", "Update Successful");
		List<String> messages = new ArrayList<String>();
	    // populate messages 

	    ra.addFlashAttribute("messages", messages);  
		return"district";
		}
		catch (Exception e)
		{
			return"district";
		}
	}
	
	
}
