package com.student.niraj;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RestController
public class ProductController {
    @Autowired
    private repositoryinterface ri;
	@Autowired
	private ProductService service;
	
	@RequestMapping("/index")
	  public String index() {
	    return "index";
	  }

/*	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
	return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
	return service.saveProducts(products);
	}
	
	@GetMapping("/Product")
	public List<Product> findAllProduct()
	{
		return service.getProducts();
	}
	@GetMapping("/ProductById/{id}")
	public Product findProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	@GetMapping("/Product/{name}")
	public Product findProductByName(@PathVariable String name)
	{
		return service.getProductByName(name);
	}	
	/*@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
	*/
	@DeleteMapping("/delete/{id}")
	/*public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
	*/
	  
	  @RequestMapping(value="/insertdata")
	  public ModelAndView insertdata(@RequestParam String txt1,@RequestParam String txt2,@RequestParam String txt3,@RequestParam String txt4,@RequestParam String txt5,@RequestParam String txt6,@RequestParam String txt7,@RequestParam String txt8,
			  @RequestParam String txt9,@RequestParam String txt10,@RequestParam String txt11,@RequestParam String txt12,
			  @RequestParam String txt13,@RequestParam String txt14,@RequestParam String txt15,@RequestParam String txt16,
			  @RequestParam String txt17,@RequestParam String txt18,@RequestParam String txt19,@RequestParam String txt20,
			  @RequestParam String txt21,@RequestParam String gender,@RequestParam String pan,
			  @RequestParam String uan,@RequestParam String department) 
	  {
	    Product p=new Product();
	    p.setGender(gender);
	    p.setPAN_Number(pan);
	    p.setUAN(uan);
	    p.setDepartment(department);
	    p.setFirstname(txt1);
	    p.setEmployeeid(txt2);
	    p.setDesignation(txt3);
	    p.setLocation(txt4);
	    p.setJoiningdate(txt5);
	    p.setAccountnumber(txt6);
	    p.setPaymentmode(txt7);
	    p.setBankname(txt8);
	    p.setMonthdays(txt9);
	   // p.setPayabledays(txt10);
	    p.setLop(txt10);
	    p.setCtcmonthly(txt11);
	    p.setBasicsalary(txt12);
	    p.sethRA(txt13);
	    p.setcCA(txt14);
	    p.setePFdeduction(txt15);
	    
	    p.setPF_Account_No(txt16);
	    p.setePF(txt16);
	    p.settDSdeduction(txt17);
	    p.setNetpayment(txt18);
	    p.setTransferamount(txt19);
	    p.setMonth(txt20);
	    p.setYears(txt21);
	   
	    Map<String, Object> params = new HashMap<>();
	   
	    service.saveProduct(p);
	    
		   
        params.put("message", "Record Inserted successfully");
       
	    
          
        return new ModelAndView("index",params);
        

	  }
		//@RequestMapping({"/getSendOTPData"})
	@RequestMapping(value="/openpdf/employees{months}" ,produces = MediaType.APPLICATION_PDF_VALUE)
	//@GetMapping(value="/openpdf/employees{months}" ,produces = MediaType.APPLICATION_PDF_VALUE)
	   // public ResponseEntity<?> getSendOTPData(ModelMap model) {
		
		public ResponseEntity<InputStreamResource> employeeReport(@RequestParam String years,@RequestParam("months") String months,@RequestParam("empid") String employeeid) throws IOException {
			
	   // System.out.println("sqlSendOtp first message : " + sqlSendOtp);
	
	  // String sqlSendOtp = "SELECT id, name, age FROM producttbl WHERE " + sqlSendOtp;
	   String sqlSendOtp = "SELECT * FROM payslip_Employee where employeeid='"+employeeid+"' and month='"+months+"' and years = '"+years+"'";
	    System.out.println("sqlSendOtp : " + sqlSendOtp);
	    List<beean> dataList = this.ri.findBySqlQuery(sqlSendOtp);
	    List<beean> employees = dataList;
	    System.out.println("dataList : " + dataList);
	   // String tableRowStr = "<table id=\"dbDateSendOtpTable\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\">  <thead><tr><th>ID</th><th>NAME</th><th>AGE</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
	    //for (int i = 0; i < dataList.size(); i++) {
	      //beean b = dataList.get(i);
	      //tableRowStr = tableRowStr + "<tr> <td>" + b.getId() + "</td> <td>" + b.getFirstName()+ "</td> <td>" + b.getFirstName() + "</td> </tr>";
	    
	    
	    ByteArrayInputStream bis = DatabasePDFService.employeePDFReport(employees,months,years);
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Disposition","Inline; filename=employees.pdf");
		return ResponseEntity.ok().headers(header).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
}
	  //  tableRowStr = tableRowStr + "</tbody></table>";
	   // return ResponseEntity.ok(tableRowStr);
	  }
	  
	  
