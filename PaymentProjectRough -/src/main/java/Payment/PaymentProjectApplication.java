package Payment;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentProjectApplication  {

	
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentProjectApplication.class, args);
		
		
	}

	
	/*@Override
	public void run(String... args) throws Exception {
		if(repository.count()==0)
		{
			repository.saveAll(Arrays.asList(
					
					new Employee("jay","ojha","Bank","9893984184"),
					new Employee("Neena","ojha","hosue wife","8319688603") ));
		}
		
}*/

}
