package Payment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface EmployeRepository extends CrudRepository<Employee, Integer> {

	//@Query("select name from payslip_Employee where id=1")
	public  List<Employee> findById(int id);
    //@Query
	//public List<Employee> findByEmployeeId(int i);
	
}
