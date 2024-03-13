package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="updatedetail")
public class Product {

	@Id
	@GeneratedValue
	private long id;
	@Column(name="fname")
	private String fname;
	@Column (name="middle")
	private String middle;
	@Column(name="last")
	private String last;
	@Column(name="phone")
	private String phone;
	@Column(name="dob")
	private String dob;
	@Column (name="email")
	private String email;
	@Column (name="category")
	private String category;
	@Column(name="spab")
	private String spab;
	@Column(name="kd")
	private String kd;
	@Column(name="state")
	private String state;
	@Column(name="district")
	private String district;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="pincode")
	private int pincode;
	@Column(name="documenttype")
	private String documenttype;
	@Column(name="dn")
	private int dn;
	@Column(name="photoname")
	private String photoname;
	@Column(name="photo")
	private byte[] Photo;
	@Column(name="password")
	private String password;
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
		this.password = password;
	}
	
	
	
	
}
