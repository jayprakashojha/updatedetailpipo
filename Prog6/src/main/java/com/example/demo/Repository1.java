package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository1 extends JpaRepository<Products,Integer> {

	 Products findByName(String name);

	Products findByName(Products product);
}
