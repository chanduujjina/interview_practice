package com.demo.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IntstaniateObjectDemo {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// new keyword
		
		Employee employee = new Employee();
		System.out.println(employee);
		
		System.out.println(employee.hashCode());
		
		//clone
		
		Employee employee1 = (Employee) employee.clone();
		
		System.out.println(employee1.hashCode());
		
		System.out.println(employee1);
		
		//serlization
		
		FileOutputStream fous = new FileOutputStream("D:/divya/employee.ser");
		
		ObjectOutputStream oous = new ObjectOutputStream(fous);
		
		oous.writeObject(employee);
		
		//deserilization
		FileInputStream fis = new FileInputStream("D:/divya/employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee employee2= (Employee) ois.readObject();
		System.out.println(employee2);
		
		System.out.println(employee2.hashCode());
		
		
		//reflection
		
		// load a class dymically
		Class cls = Class.forName("com.demo.Employee");
		
		//create instance/object for loaded class
		
		Employee employee3 = (Employee) cls.newInstance();
		
		System.out.println(employee3);
		
		System.out.println(employee3.hashCode());

	}

}
