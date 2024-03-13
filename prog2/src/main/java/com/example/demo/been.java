package com.example.demo;

public class been {
	
public int id;
public String name;
public int age;

public been()
{
}

public been(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public String toString() {
	return "been [id=" + id + ", name=" + name + ", age=" + age + "]";
}

}
