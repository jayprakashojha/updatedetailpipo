package Demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Company")
public class Bean1 {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	public int id;
	
	public Bean1(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name")
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="ownername")
	public String ownername;
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Column(name="stateid")
	public String stateid;
	public String getStateid() {
		return stateid;
	}
	public void setStateid(String stateid) {
		this.stateid = stateid;
	}
	@Override
	public String toString() {
		return "Bean1 [id=" + id + ", name=" + name + ", ownername=" + ownername + ", stateid=" + stateid + "]";
	}
	
	
			 
}
