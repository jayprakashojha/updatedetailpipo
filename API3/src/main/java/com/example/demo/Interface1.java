package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Interface1 extends JpaRepository<Product,Integer> {

	Product findByName(String command);
}
