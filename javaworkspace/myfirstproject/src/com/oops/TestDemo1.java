package com.oops;

//DTO  -->Data Transfer Object
//POJO -->Plain Old Java Object
public class TestDemo1 {
	int id;
	String name;
	double sal;
	
	public TestDemo1() {
		
	}

	public TestDemo1(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name + "-Sajjanapu";
	}

	public String getName() {
		return name;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}
	
}
