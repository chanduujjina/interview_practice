package com.demo.staticinfo;

public class StaticDemo1 {
	
	
	//static variable
	private static int rollNo;  //1
	
	//static block
	static {   // 2
		rollNo = 10;
	}
	
	static{
		rollNo = 12;
	}
	
	static{
		rollNo = 13;
	}
	
	//static method
	public static int getRollNumber(){  //3
		return rollNo;
	}
	
	public static void main(String[] args) {
		int rollno = StaticDemo1.getRollNumber();
		
		System.out.println(rollno);
	}

}
