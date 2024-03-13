package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@Autowired
private Impleintrfs service;

	
@RequestMapping("/index")
public String index()
{
	return "index";
}

@RequestMapping({"/showData"})
public ResponseEntity<?> showData(ModelMap model) {
// System.out.println("sqlSendOtp first message : " + sqlSendOtp);

// String sqlSendOtp = "SELECT id, name, age FROM producttbl WHERE " + sqlSendOtp;
String sqlSendOtp = "SELECT * FROM producttbl";
System.out.println("sqlSendOtp : " + sqlSendOtp);
List<Bean> dataList = this.service.findBySqlQuery(sqlSendOtp);
System.out.println("dataList : " + dataList);
String tableRowStr = "<table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\">  <thead><tr><th>ID</th><th>NAME</th><th>AGE</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
for (int i = 0; i < dataList.size(); i++) {
 Bean b = dataList.get(i);
 tableRowStr = tableRowStr + "<tr> <td>" + b.getId() + "</td> <td>" + b.getName() + "</td> <td>" + b.getAge() + "</td> </tr>";
} 
tableRowStr = tableRowStr + "</tbody></table>";
return ResponseEntity.ok(tableRowStr);
}
	
}
