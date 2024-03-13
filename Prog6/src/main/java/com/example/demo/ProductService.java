package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {

	@Autowired
	private Repository1 repository;
	
	public Products saveProduct(Products product)
	{
		return repository.save(product);
	}
	
	public List<Products> getProducts()
	{
		return repository.findAll();
	}
	
	public Products updateData(Products product)
	{
		Products str=repository.findById(product.getId()).orElse(null);
		str.setName(product.getName());
		str.setAge(product.getAge());
		return repository.save(str);
	}
	public void deletedata(int id)
	{
		repository.deleteById(id);
	}
	
	
	
}
