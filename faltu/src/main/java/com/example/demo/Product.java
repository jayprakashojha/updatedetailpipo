package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="Registrationtb2")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	@NotNull
	private String name;
	@NotNull
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
	@Column(name="image")
	private byte[] image;
	private String imagename;
	
	
	
	
	
	
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", middle=" + middle + ", last=" + last + ", phone=" + phone
				+ ", dob=" + dob + ", email=" + email + ", category=" + category + ", spab=" + spab + ", kd=" + kd
				+ ", state=" + state + ", district=" + district + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", documenttype=" + documenttype + ", dn=" + dn + "]";
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
	
}
