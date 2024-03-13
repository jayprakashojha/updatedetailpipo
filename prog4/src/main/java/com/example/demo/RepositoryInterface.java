package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<Product,Integer>{

	Product findByName(String name);
}
