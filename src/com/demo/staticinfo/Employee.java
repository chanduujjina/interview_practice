package com.demo.staticinfo;

public class Employee {
	
	

	private static String organizatonName;
	
	static{
		organizatonName = "techsec";
	}
	
	public static String getOrganizationName(){
		return organizatonName;
	}
	
	private int id;
	
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
