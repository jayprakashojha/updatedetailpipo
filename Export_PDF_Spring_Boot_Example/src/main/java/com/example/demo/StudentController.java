package com.example.demo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Student;
import com.example.demo.StudentService;
import com.example.demo.PdfGenerator;
import com.lowagie.text.DocumentException;

@Controller
@RequestMapping("/")
public class StudentController {

	@Autowired
	  private StudentService studentService;
	  @GetMapping("/export-to-pdf")
	  public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException 
	  {
	    response.setContentType("application/pdf");
	    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
	    String currentDateTime = dateFormat.format(new Date());
	    String headerkey = "Content-Disposition";
	    String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";
	    response.setHeader(headerkey, headervalue);
	    List < Student > listofStudents = studentService.getStudentList();
	    PdfGenerator generator = new PdfGenerator();
	    generator.generate(listofStudents, response);
	  }
	
	@RequestMapping("/index")
 public String index()

 {
	 return"index";
 }
}