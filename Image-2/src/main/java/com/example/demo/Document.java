package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="document")
public class Document {

	@Id
	@GeneratedValue
	private long id;
	@Column(length=512, nullable=false,unique=true)
	private String name;
	private long size;
	@Column(name="upload_time")
	private Date uploatTime;
	private byte[] content;
	@Column(name="Address")
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Date getUploatTime() {
		return uploatTime;
	}
	public void setUploatTime(Date uploatTime) {
		this.uploatTime = uploatTime;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	
	
	
}
