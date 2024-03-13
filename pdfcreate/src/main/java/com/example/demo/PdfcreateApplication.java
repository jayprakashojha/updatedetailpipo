package com.example.demo;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class PdfcreateApplication implements CommandLineRunner {
	 @Autowired
	    EmployeeRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(PdfcreateApplication.class, args);
		 @Override
		    public void run(String... args) throws Exception {

		        if (repository.count() == 0) {
		            // save a list of Employees
		            repository.saveAll(Arrays.asList(
		                        new Employee("Adam", "John"), 
		                           new Employee("Sibin", "M"),
		                             new Employee("Arun", "Mohan"), 
		                                new Employee("Scott", "Morrison"),
		                                   new Employee("Hikaru", "Nakamura"), 
		                                     new Employee("Ishivaka", "Yusuke")));
		        }

		    }
	}


