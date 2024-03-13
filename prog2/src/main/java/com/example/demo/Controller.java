package com.example.demo;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	 @PostMapping({"/insertdata"})
	  public String insertdata(@RequestParam String txt1,@RequestParam Integer txt2) 
	  {
		 System.out.println(txt1);
		 System.out.println(txt2);
	    //Product p=new Product();
		//p.setName(txt1);
		//p.setAge(txt2);
		//service.saveProduct(p);
		return "index";
		
		
	  }
}
