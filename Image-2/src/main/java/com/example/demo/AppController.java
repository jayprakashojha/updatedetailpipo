package com.example.demo;


import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private DocumentRepository repo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
		
	}
	
	@RequestMapping("/district")
	public String district()
	{
		return "district";
	}
	@PostMapping("/upload")
	public String uploadFile(@RequestParam String text1,@RequestParam("document") MultipartFile multipartfile,
			RedirectAttributes ra) throws IOException
	{
		String fileName=StringUtils.cleanPath(multipartfile.getOriginalFilename());
		Document document=new Document();
		document.setName(fileName);
		document.setContent(multipartfile.getBytes());
		document.setSize(multipartfile.getSize());
		document.setAddress(text1);
		
		repo.save(document);
		
		ra.addFlashAttribute("message1", "the file has been upload sucessfully");
		return "index";
	}
	
	
}
