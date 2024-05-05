package com.example.demo;

public class Bean1 {

	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String occuption;
	public String getOccuption() {
		return occuption;
	}
	public void setOccuption(String occuption) {
		this.occuption = occuption;
	}
	@Override
	public String toString() {
		return "Bean1 [name=" + name + ", occuption=" + occuption + "]";
	}
	
}
