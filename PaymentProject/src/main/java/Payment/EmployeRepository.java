package Payment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@EnableJpaRepositories
public interface EmployeRepository extends JpaRepository<Employee, Integer> {

	public  List<Employee> findById(int id);
   

	//public List<Employee> findBySqlQuery(String sqlSendOtp);
	
//	public List<Employee> findByLocation(String location);
	
   // public List<Employee> findByLocation(String location);
  //  public abstract List<Employee> findByLocation(String paramString);
 	//@Query("select Designation from payslip_Employee where Employee_Id='107'")
    //public  List<Employee> findByEmployee_Id(String Employee_Id);
   
	
}
