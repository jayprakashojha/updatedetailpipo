package Payment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PDFExportController {

	
	@Autowired
	EmployeRepository employeRepository;
	

	
	@GetMapping(value="/openpdf/employees" ,produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> employeeReport() throws IOException {
	
		//System.out.println(months);
		//System.out.println(year1);
		
	List<Employee> employees = (List<Employee>)employeRepository.findById(1);
		ByteArrayInputStream bis = DatabasePDFService.employeePDFReport(employees);
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
