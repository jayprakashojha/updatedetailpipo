package Payment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController

public class PDFExportController {

	
	@Autowired
	public EmployeRepository employeRepository;
	
	@Autowired
	public FetchRepository serRepo;
	

	
	@GetMapping(value="/openpdf/employees{months}" ,produces = MediaType.APPLICATION_PDF_VALUE)
	@ResponseBody
	public ResponseEntity<InputStreamResource> employeeReport(@RequestParam String year,@RequestParam("months") String months) throws IOException {
	
		String sqlSendOtp = "SELECT * FROM payslipEmployee where location='guna'";
		   System.out.println("sqlSendOtp : " + sqlSendOtp);
		   // List<EmpBean> employees1 = this.serRepo.findBySqlQuery(sqlSendOtp);
		   List<EmpBean> emp1 = (List<EmpBean>)serRepo.findBySqlQuery(sqlSendOtp);
		    System.out.println(emp1);
		     
		
		
		
	  List<Employee> employees = (List<Employee>)employeRepository.findById(1);
		//List<Employee> employees = (List<Employee>)serRepo.getfindByLocation("guna");
		ByteArrayInputStream bis = DatabasePDFService.employeePDFReport(employees,months,year);
			HttpHeaders header = new HttpHeaders();
			header.add("Content-Disposition","Inline; filename=employees.pdf");
			return ResponseEntity.ok().headers(header).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
	}
 	
	@RequestMapping("/index")
	public String index()
	{
		
		return "index";
	}
}
