package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
public class Controller {
@Autowired
private InterfaceImpl ri;
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Products addProduct(@RequestBody Products product)
	{
		return service.saveProduct(product);
	}
	@GetMapping("/showData")
	public List<Products> getData()
	{
		return service.getProducts();
	}
	
	@PutMapping("/updatedata")
	public Products updatedata(@RequestBody Products product)
	{
		return service.updateData(product);
	}
	
	@DeleteMapping("/deletedata/{id}")
	public void deletedata(@PathVariable int id)
	{
		service.deletedata(id);
	}
	
	@RequestMapping("/showAction")
	public ResponseEntity<?> showaction(ModelMap model)
	{
		String str="select * from producttble";
		List<Beans> dataList=ri.findBySqlQuery(str);
		String tableRowStr = "<table id=\"tablename\" class=\"table table-striped table-bordered table-sm\" style=\"width: 50%; font-size: fs;\"><thead><tr><th>ID</th><th>NAME</th><th>AGE</th></tr></thead><tbody id=\"dbDateSendOtpTableBody\">";
		for(int i=0;i<dataList.size();i++)
		{
		Beans b=dataList.get(i);
		tableRowStr = tableRowStr + "<tr> <td><a href=getId>" + b.getId() + "</a></td> <td>" + b.getName() + "</td> <td>" + b.getAge() + "</td> </tr>";
		  }
		 tableRowStr = tableRowStr + "</tbody></table>";
		return ResponseEntity.ok(tableRowStr);
	}
	
	@PostMapping("/insertAction")
	public String insertAction(@RequestParam String t1,@RequestParam Integer t2)
	{
		System.out.println(t1);
		System.out.println(t2);
		Products p=new Products();
		
		p.setName(t1);
		p.setAge(t2);
		
		
		service.saveProduct(p);
		return "index";
	}
}
