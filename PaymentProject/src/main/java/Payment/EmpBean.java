package Payment;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public class EmpBean {

	 private int id;
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String location;
	  public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	private int Employee_Id;
	
	public EmpBean()
	{
		
	}
	
	public EmpBean(int id, String location, int employee_Id) {
		
		this.id = id;
		this.location = location;
		Employee_Id = employee_Id;
	}
	@Override
	public String toString() {
		return "EmpBean [id=" + id + ", location=" + location + ", Employee_Id=" + Employee_Id + "]";
	}
	
	
}
