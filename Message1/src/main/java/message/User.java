package message;

public class User {

	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String message1;
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public User()
	{
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", message1=" + message1 + "]";
	}
	
}
