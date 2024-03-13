package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="IMGTABLE1")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {

	@Id
	@GeneratedValue
    @Column(name="id")
	private long id;
	@Column (name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="image")
	private byte[] image;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	

	
	
	
}
