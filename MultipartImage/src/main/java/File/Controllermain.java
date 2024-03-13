  package File;


import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.util.StringUtils;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class Controllermain {

	
	
	public int s;
	String Username;
    public int count;
    public String punchintime;
    @Autowired
    private Interfacefirst service;
	@Autowired
	
	
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/Registration")
	public String Registration()
	{
		return"Registration";
	}
	
	
	@PostMapping("/upload")
	public String uploadFile(
	
			
			@RequestParam("document") MultipartFile multipartfile,
			RedirectAttributes ra) throws IOException
	{
		String fileName=StringUtils.cleanPath(multipartfile.getOriginalFilename());
		Product document=new Product();
			document.setPhoto(multipartfile.getBytes());
		document.setPhotoname(fileName);
		service.save(document);	
		return "Registration";
	}
		
}
