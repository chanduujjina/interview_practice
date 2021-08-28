package com.demo.immutable;

public class CustomImmutableDemo {
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "chandu", "male");
		student1 = new Student(2, "siva", "male");
		
		System.out.println(student1);
		
	}

}
