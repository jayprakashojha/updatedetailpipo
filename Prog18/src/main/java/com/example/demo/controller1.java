package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controller1 {

	public int s;
	String Username;
    public int count;
    public String punchintime;
    @Autowired
    private Interfacefirst service;
	@Autowired
	private Interface2Implsecond servi;
	@Autowired
	private InterfaceDT1 dts;
	
	
	@RequestMapping("/")
	public String first(Model model)
	{
	
		return "first";
	}
	@RequestMapping("/ShowData")
	public String showdata(Model model)
	{
	
		return "ShowData";
	}
	
	
	@RequestMapping("/Registration")
	public String states(Model model)
	{
		model.addAttribute("message","Successfully");
		return "Registration";
	}
	
	@RequestMapping("/LogIn1")
	public String LogIn(@RequestParam String username,@RequestParam String pwd,Model model)
	{
		
		Username=username;
		System.out.println("received in services username"+ username);
		System.out.println("received in services password"+pwd);
        String str="select phone,password from updatedetail";
		List<Bean> dataList=servi.findBySqlQuery(str);
		for(int i=0;i<dataList.size();i++)
		{
		Bean b=dataList.get(i);
		String phone =   b.getPhone();
		 String pwd1=    b.getPassword();
		
		 
		 
		if(username.equals(phone) && pwd.equals(pwd1))
		{
			System.out.println(phone);
			System.out.println(pwd1);
				s=0;
				System.out.println(s);
				return "LogIn1";
				
		}
		else
		{ 
			
		s=1;
		}}
		if(s==0)
		{
			
			return "LogIn1";
		}
		else
		{
			model.addAttribute("message", "Please provide Correct mobile number and password");
					return "first";
		}

}
	
	@PostMapping("/upload")
	public String uploadFile(Model model,@RequestParam String fname,@RequestParam String middle,@RequestParam String last,
			@RequestParam String phone,
			@RequestParam String dob,
			@RequestParam String email,
			@RequestParam String category,
			@RequestParam String spab,
			@RequestParam String kd,
			@RequestParam String state,
			@RequestParam String district,
			@RequestParam String address,
			@RequestParam String city,
			@RequestParam int pincode,
			@RequestParam String documenttype,
			@RequestParam int dn,
	
			
			@RequestParam("document") MultipartFile multipartfile,
			RedirectAttributes ra) throws IOException
	{
		String fileName=StringUtils.cleanPath(multipartfile.getOriginalFilename());
		Product document=new Product();
		document.setFname(fname);
		document.setMiddle(middle);
		document.setLast(last);
		document.setPhone(phone);
		document.setDob(dob);
		document.setEmail(email);
		document.setCategory(category);
		document.setSpab(spab);
		document.setKd(kd);
		document.setState(state);
		document.setDistrict(district);
		document.setAddress(address);
		document.setCity(city);
		System.out.println(city);
		document.setPincode(pincode);
		document.setDocumenttype(documenttype);
		document.setDn(dn);
		String pwd=PasswordGenerate.generateRandomString(10);
		document.setPassword(pwd);
		System.out.println(pwd);
		System.out.println(city);
		document.setPhoto(multipartfile.getBytes());
		document.setPhotoname(fileName);
		
		
		service.save(document);
		model.addAttribute("success", "Your Registration Successfully Done");
		return "Registration";
	}
	@RequestMapping("/getSendOTPData")
	public ResponseEntity<?> showaction(ModelMap model)
	//public String showaction(Model model)
	{
		
		String str="select id,fname,phone from updatedetail";
		
		List<Bean> dataList=servi.findBySqlQuery(str);
	
		
		//String tableRowStr = "<table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 30%; font-size: fs;\"><thead><tr><th>ID</th><th>NAME</th><th>Phone</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
	//	String tableRowStr = "<style>tablename, th, td {\r\n"
		//		+ "  border: 1px solid black;\r\n"
			//	+ "border-collapse: collapse;}</style><table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 30%; font-size: fs;\"><thead><tr><th>ID</th><th>NAME</th><th>Phone</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
		 String tableRowStr = "<table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\">  <thead><tr><th>ID</th><th>NAME</th><th>PHONE</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
		
		for(int i=0;i<dataList.size();i++)
		{
		Bean b=dataList.get(i);
		count=i;
		
		tableRowStr = tableRowStr + "<tr> <td><a href=getId>" + b.getId() + "</a></td> <td>" + b.getFname() + "</td><td>" + b.getPhone() + "</td></tr>";
		//id1=(b.getId());
		
		
		}
		count++;
		tableRowStr=tableRowStr +"<tr> <td>Total Records:-"+count+"</label></td></tr>";
		 tableRowStr = tableRowStr + "</tbody></table>";
		 
		return ResponseEntity.ok(tableRowStr);
		// return "tableRowStr";
	}

	
	@PostMapping("/punchinout")
	public String punchinout(Model model)
	{
		java.util.Date date = Calendar.getInstance().getTime();  
        // SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         String strDatepin = dateFormat.format(date);  
         System.out.println("Converted String: " + strDatepin);  
         punchintime=strDatepin;
		
         FetchDataDB pi=new FetchDataDB();
			String punchi=pi.fetchpunchinput(Username,strDatepin);
			 System.out.println("punch in time is"+punchi);
			 System.out.println(Username);
			 
			 if(strDatepin.equals(punchi)) {
				 model.addAttribute("punchsuccess", "Your Punch In already Done");
				 return "LogIn1";
			 }
			 else
			 {
		DTEntity d=new DTEntity();
		d.setPhone(Username);
		d.setPunchin(strDatepin);
		dts.save(d);
		
		model.addAttribute("punchsuccess", "Your Punch In Successfully Done");
		return"LogIn1";
			 }
	}
	
	
		
		@PostMapping("/punchout")
		public String updateProduct(Model model)
		{
			java.util.Date date = Calendar.getInstance().getTime();  
	         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
	         String strDate = dateFormat.format(date); 
	         System.out.println(strDate);
	         
			FetchDataDB pi=new FetchDataDB();
			String punchi=pi.fetchpunchinput(Username,strDate);
			 System.out.println("punch in Date is"+punchi);
			 
			
	      
	   try
	         {
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "12345");
	         System.out.println("Connection established......");
	         //Inserting values to a table

	        // String query = "INSERT INTO punchio1(id,punch_out) VALUES (?,?)";
	         String query="update punchio1 set punch_out='"+strDate+"' where phone='"+Username+"'and punch_in='"+punchi+"'";

	         PreparedStatement pstmt = con.prepareStatement(query);
	        // pstmt.setInt(1, 12);
	        // pstmt.setString(2, strDate);
	        
	         pstmt.execute();
	         System.out.println("Punch Out Sucessfully......");
	         model.addAttribute("punchsuccess", "Your Punch Out Successfully Done");
	         
	         }
	         catch(Exception e)
	         {
	        	 
	         }
	  
	         return "LogIn1";
	      }
}