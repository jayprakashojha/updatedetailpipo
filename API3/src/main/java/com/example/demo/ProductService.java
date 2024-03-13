package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private Interface1 repository;
	
	public Product saveProduct(Product products)
	{
		return repository.save(products);
	}
	
	public List<Product> getdata()
	{
		return repository.findAll();
	}
	
	public void deleteData(int id)
	{
		
     repository.deleteById(id);
	}
	
	public Product updateData(Product products)
	{
		Product existringdata=repository.findById(products.getId()).orElse(null);
		existringdata.setName(products.getName());
		existringdata.setAge(products.getAge());
		return repository.save(existringdata);
	}
	
	
	
}
