package com.example.demo;

import java.util.Arrays;

public class Bean {

	private long id;
	private String fname;
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
	private String photoname;
	private byte[] Photo;
	private String password;
	
	public Bean()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSpab() {
		return spab;
	}
	public void setSpab(String spab) {
		this.spab = spab;
	}
	public String getKd() {
		return kd;
	}
	public void setKd(String kd) {
		this.kd = kd;
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
	public String getPhotoname() {
		return photoname;
	}
	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	public byte[] getPhoto() {
		return Photo;
	}
	public void setPhoto(byte[] photo) {
		Photo = photo;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public Bean(long id, String fname, String middle, String last, String phone, String dob, String email,
			String category, String spab, String kd, String state, String district, String address, String city,
			int pincode, String documenttype, int dn, String photoname, byte[] photo, String password) {
		super();
		this.id = id;
		this.fname = fname;
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
		this.photoname = photoname;
		Photo = photo;
		this.password = password;
	}
	public Bean(long id, String fname, String middle, String last, String phone, String dob, String email,
			String category, String spab, String kd, String state, String district, String address, String city,
			int pincode, String documenttype, int dn, String photoname, byte[] photo) {
		super();
		this.id = id;
		this.fname = fname;
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
		this.photoname = photoname;
		Photo = photo;
	}
	@Override
	public String toString() {
		return "Bean [id=" + id + ", fname=" + fname + ", middle=" + middle + ", last=" + last + ", phone=" + phone
				+ ", dob=" + dob + ", email=" + email + ", category=" + category + ", spab=" + spab + ", kd=" + kd
				+ ", state=" + state + ", district=" + district + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", documenttype=" + documenttype + ", dn=" + dn + ", photoname=" + photoname
				+ ", Photo=" + Arrays.toString(Photo) + ", password=" + password + "]";
	}
	
	
	
}