package bean;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Faltu12Application {

	public static void main(String[] args) {
		SpringApplication.run(Faltu12Application.class, args);
		try (//ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config2.xml")) {
			Vehicle b1=context.getBean("myVehicle",Vehicle.class);
			System.out.println(b1.mileage());
			System.out.println(b1.speed());	
		
			} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
		}
	


  
