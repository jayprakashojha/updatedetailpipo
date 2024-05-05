package message;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class Controller1 {

	@RequestMapping("/")
	public String index()
	{
		return"index";
	}
	
	@RequestMapping("/page2")
	public String page2( HttpSession session)
	{
		int a=37;
		session.setAttribute("message", a);
		return"page2";
	}
	
	 @RequestMapping("/message")
	    public ModelAndView message(@RequestParam String name,
	                                @RequestParam String occupation,User user) {

		
	     
	        Map<String, Object> params = new HashMap<>();
	        params.put("message", "Record Inserted successfully");
	        
	        

	        return new ModelAndView("page2", params);
		 
	       // return null;
		 

	    }

}
