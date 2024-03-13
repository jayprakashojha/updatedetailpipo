package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="punchio1")

public class DTEntity {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="PunchIn")
	private String punchin;
	@Column(name="phone")
	private String phone;
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
	@Column(name="PunchOut")
	private String punchout;
	public String getPunchout() {
		return punchout;
	}
	public void setPunchout(String punchout) {
		this.punchout = punchout;
	}
	
	
	
	
	
	
	
}
