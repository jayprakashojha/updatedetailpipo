package File;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JspfirstApplication implements CommandLineRunner{
	@Autowired
	  private StudentService studentService;
	  	
	public static void main(String[] args) {
		SpringApplication.run(JspfirstApplication.class, args);
		
	  }
	 @Override
	  public void run(String...a) {
	    for (int i = 1; i <= 1; i++) {
	    	
	    	System.out.println("main method class");
	      Student student = new Student();
	      student.setStudentName("Rinku Kushwaha");
	      student.setEmail("jay08jha@mail.com");
	      student.setMobileNo("7987121389");
	      studentService.addStudent(student);
	      
	    }
	
	  }
	 
}
