package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
   private Interfacee intr;
	
	public Product addProduct(Product product)
	{
		return intr.save(product);
	}
	
	public List<Product> getData()
	{
		return intr.findAll();
	}
}
