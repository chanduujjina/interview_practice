package com.demo.object;

import java.io.Serializable;

public class Employee implements Cloneable,Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", genders=" + genders
				+ ", deptName=" + deptName + "]";
	}

	public Employee(int id, String name, String genders, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.genders = genders;
		this.deptName = deptName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stusb
	}

	private int id;
	
	private String name;
	
	private String genders;
	
	private String deptName;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
