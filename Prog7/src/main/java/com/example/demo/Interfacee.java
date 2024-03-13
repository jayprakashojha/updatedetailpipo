package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Interfacee extends JpaRepository<Product,Integer> {

	public Product findByName(Product product);
}
