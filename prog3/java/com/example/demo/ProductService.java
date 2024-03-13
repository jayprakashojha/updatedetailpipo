package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	public ProductRepository repository;
	
	
	
	public Product saveProduct(Product products)
	{
		return repository.save(products);
	}
	
}
