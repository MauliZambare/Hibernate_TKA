package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// pojo class	

@Entity
public class Employee {
	
	//fields
	@Id
	private long phoneno;
	private String name;
	private int age;
	private String Address;
	
	//getter & setter
	
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	// arg constructor
	
	public Employee(String name, int age, long phoneno, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		Address = address;
	}
	
	
	// no arg constructor
	
	public Employee() {
		
	}
	
	
	// to string 
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phoneno=" + phoneno + ", Address=" + Address + "]";
	}
	
	
	
	
	
	
	
}
