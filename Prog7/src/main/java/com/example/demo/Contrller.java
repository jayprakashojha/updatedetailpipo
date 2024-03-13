package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contrller {

	@Autowired
	public ProductService service;
	
	@PostMapping("/addProducts")
	public Product addProducts(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	@GetMapping("/showData")
	public List<Product> showdata()
	{
		return service.getData();
	}
}
