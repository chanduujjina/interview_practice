package com.demo.staticinfo;

public class StaticClient1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "gouse") ;
		Employee emp2 = new Employee(2, "sai") ;
		
		System.out.println(Employee.getOrganizationName());
		
		System.out.println(emp1.getOrganizationName());
		
		System.out.println(emp2.getOrganizationName());

	}

}
