package File;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;





@Controller
public class ControllerPGM {

	@Autowired
    private repositoryinterface ri;
	@Autowired
	private Interface1 service;
	
	@RequestMapping("/index")
	public String index()
	{
		System.out.println("guna");
		return"index";
	}

	@RequestMapping("/ShowDetail")
	public String ShowDetail()
	{
		return "ShowDetail";
	}
	
	
	
	@RequestMapping("/Registration")
	public String Registration()
	{
		System.out.println("guna registration");
		return"Registration";
	}
	
	
	@RequestMapping("/upload")
	public String upload(@RequestParam String fname,@RequestParam String fathername,@RequestParam String mothername,@RequestParam Date dob,
			@RequestParam String ca,@RequestParam String pa,@RequestParam String mobile,@RequestParam String email,
			
					
			@RequestParam("document") MultipartFile multipartfile,
			RedirectAttributes ra) throws IOException
	{
		String fileName=StringUtils.cleanPath(multipartfile.getOriginalFilename());
		System.out.println(fileName);
		BeanEntity document=new BeanEntity();
		document.setName(fname);
		document.setFatherName(fathername);
		document.setMotherName(mothername);
		document.setDob(dob);
		document.setMobile(mobile);
		document.setEmailid(email);
		document.setCurrentAddress(ca);
		document.setPermanentAddress(pa);
		document.setPhoto(multipartfile.getBytes());
		document.setPhotoname(fileName);
		
		
		service.save(document);
		
		
		
	
		return "Registration";
	}
	@RequestMapping({"/getSendOTPData"})
    public ResponseEntity<?> getSendOTPData(ModelMap model) {
 
  String sqlSendOtp = "SELECT * FROM payingguest1";
   System.out.println("sqlSendOtp : " + sqlSendOtp);
   List<BeanEntity> dataList = this.ri.findBySqlQuery(sqlSendOtp);
   System.out.println("dataList : " + dataList);
   String tableRowStr = "<table id=\"dbDateSendOtpTable\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\">  <thead><tr><th>ID</th><th>NAME</th><th>FatherName</th><th>MotherName</th><th>DOB</th><th>Mobile</th><th>E-Mail</th><th>CurrentAddress</th><th>PermanentAddress</th><th>Photo</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
   for (int i = 0; i < dataList.size(); i++) {
     BeanEntity b = dataList.get(i);
     tableRowStr = tableRowStr + "<tr> <td>" + b.getId() + "</td> <td>" + b.getName() + "</td> <td>" + b.getFatherName() + " </td> <td>"+b.getMotherName()+"</td><td>"+b.getDob()+"</td><td>"+b.getMobile()+"</td><td>"+b.getEmailid()+"</td><td>"+b.getCurrentAddress()+"</td><td>"+b.getPermanentAddress()+"</td><td>"+b.getPhoto().toString()+"</td></tr>";
   } 
   tableRowStr = tableRowStr + "</tbody></table>";
   return ResponseEntity.ok(tableRowStr);
 }
 
}
