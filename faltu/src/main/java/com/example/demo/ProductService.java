package com.example.demo;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService  {

	@Autowired
	private Interface1 interser;
	
	public Product addData(Product product) 
	{
		
		
		 return interser.save(product);
		 
	}

	
	
	
	
}
