package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

	@Autowired
	public ProductService service;
	
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product products)
	{
		return service.saveProduct(products);
	}
	
	@GetMapping("/showData")
	public List<Product> findAllData()
	{
		return service.getdata();
	}
	
	@DeleteMapping("/deleteiddata/{id}")
	public void deletedata(@PathVariable int id)
	{
		 service.deleteData(id);
	}
	
	@PutMapping("/updatedata")
	public Product updatedata(@RequestBody Product products)
	{
		return service.updateData(products);
				
	}
	
	
	
}
