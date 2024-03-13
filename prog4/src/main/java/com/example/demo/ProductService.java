package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private RepositoryInterface repository;
	
	Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
}
