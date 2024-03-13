package com.example.demo;

import com.itextpdf.text.DocumentException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itextpdf.text.DocumentException;

import jakarta.validation.Valid;



@RestController

public class Controller<FileStorageService> {
	
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private Interface2Impl servi;
	
	 	@PostMapping("/registerdata")
	public String register(@Valid @RequestParam String name,@Valid @RequestParam String middle,@RequestParam String last,@RequestParam String phone, @RequestParam String dob,@RequestParam String email,@RequestParam String category,
			@RequestParam String spab,@RequestParam String kd,@RequestParam String state,
			@RequestParam String district,@RequestParam String address,@RequestParam String city,
			@RequestParam Integer pincode,@RequestParam String documenttype,RedirectAttributes ra,@RequestParam int dn
			) throws IOException
	{
	 		
		Product p=new Product();
		p.setName(name);
	    p.setMiddle(middle);
	    p.setLast(last);
	    p.setPhone(phone);
	    p.setDob(dob);
	    p.setEmail(email);
	    p.setCategory(category);
	    p.setSpab(spab);
	    p.setKd(kd);
	    p.setState(state);
	    p.setDistrict(district);
	    p.setAddress(address);
	    p.setCity(city);
	    p.setPincode(pincode);
	    p.setDocumenttype(documenttype);
	    p.setDn(dn);
	    
	    
	    
		service.addData(p);
		
		
		System.out.println(dn);
		ra.addFlashAttribute("success", "Everything went just fine.");
		return "index";
	}
	 	
	 	@PostMapping("/upload")
		public String uploadFile(@RequestParam("document") MultipartFile multipartfile,
				RedirectAttributes ra) throws IOException
		{
			String fileName=StringUtils.cleanPath(multipartfile.getOriginalFilename());
			Product document=new Product();
			document.setName(fileName);
			document.setImage(multipartfile.getBytes());
			document.setName(multipartfile.getName());
			
			service.addData(document);
			ra.addFlashAttribute("success", "Everything went just fine.");
		
			return "index";
		}
	 	
	@RequestMapping({"/showAction"})
	public ResponseEntity<?> showaction(ModelMap model)
	{
		String str="select id,name,phone from registrationtbl";
		List<Bean> dataList=servi.findBySqlQuery(str);
		String tableRowStr = "<table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\"><thead><tr><th>ID</th><th>NAME</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
		for(int i=0;i<dataList.size();i++)
		{
		Bean b=dataList.get(i);
		tableRowStr = tableRowStr + "<tr> <td><a href=getId>" + b.getId() + "</a></td> <td>" + b.getName() + "</td></tr>";
		  }
		 tableRowStr = tableRowStr + "</tbody></table>";
		return ResponseEntity.ok(tableRowStr);
	}
	
	
	
	@PostMapping("/pdf")
    public ResponseEntity<byte[]> exportPdf(@RequestBody HttpRequest request,ModelMap model) throws IOException, DocumentException {
    	String str="select id,name,phone from registrationtbl";
    	List<Bean> queryResults = servi.findBySqlQuery(str);
        ByteArrayOutputStream pdfStream = PdfUtils.generatePdfStream(queryResults);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=query_results.pdf");
        headers.setContentLength(pdfStream.size());
        return new ResponseEntity<>(pdfStream.toByteArray(), headers, HttpStatus.OK);
    }
}
	   

	

