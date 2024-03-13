package mobile;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class ProductController {
    
	@Autowired
	private ProductService service;
	
	@GetMapping("/index")
	  public String index() {
	    return "index";
	  }

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
	return service.saveProduct(product);
	}
 
	  }
