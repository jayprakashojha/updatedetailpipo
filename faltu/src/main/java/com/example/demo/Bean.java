package com.example.demo;

import java.util.Arrays;

public class Bean {

	private int id;
	private String name;
	private String middle;
	private String last;
	private String phone;
	private String dob;
	private String email;
	private String category;
	private String spab;
	private String kd;
	private String state;
	private String district;
	private String address;
	private String city;
	private int pincode;
	private String documenttype;
	private int dn;
	private byte[] image;
	
	public Bean(int id, String name, String middle, String last, String phone, String dob, String email,
			String category, String spab, String kd, String state, String district, String address, String city,
			int pincode, String documenttype, int dn, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.middle = middle;
		this.last = last;
		this.phone = phone;
		this.dob = dob;
		this.email = email;
		this.category = category;
		this.spab = spab;
		this.kd = kd;
		this.state = state;
		this.district = district;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.documenttype = documenttype;
		this.dn = dn;
		this.image = image;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	


	public String getDocumenttype() {
		return documenttype;
	}


	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}


	public int getDn() {
		return dn;
	}


	public void setDn(int dn) {
		this.dn = dn;
	}


	public String getKd() {
		return kd;
	}


	public void setKd(String kd) {
		this.kd = kd;
	}


	
	
	
	
	
	
	
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSpab() {
		return spab;
	}


	public void setSpab(String spab) {
		this.spab = spab;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Bean()
	{}
	
	
	public Bean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getMiddle() {
		return middle;
	}


	public void setMiddle(String middle) {
		this.middle = middle;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Bean [id=" + id + ", name=" + name + ", middle=" + middle + ", last=" + last + ", phone=" + phone
				+ ", dob=" + dob + ", email=" + email + ", category=" + category + ", spab=" + spab + ", kd=" + kd
				+ ", state=" + state + ", district=" + district + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", documenttype=" + documenttype + ", dn=" + dn + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
}
