package com.example.demo;


public class BeanUPD {

	
	private Long id;
	
	private String phone;
	private String punchin;
    private String punchout;
    
    public BeanUPD()
    {
    	
    }
	public BeanUPD(Long id, String phone, String punchin, String punchout) {
		super();
		this.id = id;
		this.phone = phone;
		this.punchin = punchin;
		this.punchout = punchout;
	}
	
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPunchin() {
		return punchin;
	}
	public void setPunchin(String punchin) {
		this.punchin = punchin;
	}
	
	public String getPunchout() {
		return punchout;
	}
	public void setPunchout(String punchout) {
		this.punchout = punchout;
	}
	@Override
	public String toString() {
		return "BeanUPD [id=" + id + ", phone=" + phone + ", punchin=" + punchin + ", punchout=" + punchout + "]";
	}
	
	
	

}
