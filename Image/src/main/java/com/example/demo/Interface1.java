package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Interface1 extends JpaRepository<Product,Long>{

	Product findByName(String commmand);
}
