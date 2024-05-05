package Demo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.hibernate.mapping.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Controller1 {

	@Autowired
	public Service1 rep1;
	
	@Autowired
	public Repository1 rep;
	
//	@RequestMapping("/index")
	//public String index()
	//{
		
		
	//	return "index";
	//}
	
	@RequestMapping("/map")
	public String view(Map<String,Object> map)
	{
		map.put("name", "hi jay");
		System.out.println(map);
		return "index";
		
	}
	
	
	@RequestMapping("/index")
	public String view1(@RequestParam String txt1,ModelMap model)
	{
		model.addAttribute("name",txt1);
		System.out.println(model);
		return "index";
	}
	@RequestMapping("/customer")
	public String customer1()
	{
		return "customer";
	}
	
	@RequestMapping(value="/company")
	public String insertdata(@RequestParam("txt1") String name1,@RequestParam("ownername") String name2)
	{
		Bean1 b=new Bean1(name2, name2);
		b.setName(name1);
		b.setOwnername(name2);
		//b.setStateid(stateid);
		rep1.savedata1(b);
		System.out.println("Record Inserted Successfully");
		
		return "index";
	}
	
	@GetMapping("/showdata") 
	public String showdata() 
	{
		List<Bean1> b1= this.rep.findAll();
		System.out.println(b1);
		return "index";
		
	}
	//@ModelAttribute("/customer")
	//public Bean1 customer()
	//{
	//	return new Bean1("jay","mp");
//	}
	
	@RequestMapping("/customerser")
	public String customer(ModelMap model)
	{
		model.addAttribute("customer.name", "ajay");
		model.put("customer.name", "ajayprakash");
		return "customer";
	}
	
	
	

}
