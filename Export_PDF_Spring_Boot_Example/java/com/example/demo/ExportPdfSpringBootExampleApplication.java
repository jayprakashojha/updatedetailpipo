package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ExportPdfSpringBootExampleApplication implements CommandLineRunner  {
	 @Autowired
	  private StudentService studentService;
	 
	  public static void main(String[] args) {
	    SpringApplication.run(ExportPdfSpringBootExampleApplication.class, args);
	  }
	  @Override
	  public void run(String...a) {
	    for (int i = 1; i <= 1; i++) {
	      Student student = new Student();
	      student.setStudentName("vanshika prakash ojha");
	      student.setEmail("ajay@mail.com");
	      student.setMobileNo("123456789");
	      studentService.addStudent(student);
	    }
	
	  }
}
