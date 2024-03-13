package com.example.demo;
import java.io.*;
import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itextpdf.html2pdf.HtmlConverter;

@SpringBootApplication
public class RegistrationFormApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RegistrationFormApplication.class, args);
		//HtmlConverter.convertToPdf(new File("./pdf-input.html"),new File("demo-html.pdf"));
	}

}
