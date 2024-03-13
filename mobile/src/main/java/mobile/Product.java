package mobile;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producttb2")
public class Product {

	@Id 
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
   private int age;
	@Column(name="mobile")
	private int mobile;
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Product()
	{
		
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
