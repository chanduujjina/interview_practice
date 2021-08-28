package com.demo.design;

public class SigletonClient {

	public static void main(String[] args) {
		
		//SingletonDesignPattern designPattern = new SingletonDesignPattern();
		
		//requesting the instance first time
		SingletonDesignPattern pattern1 =  SingletonDesignPattern.getInstance();
		
		//requesting the instance second time
		
		SingletonDesignPattern pattern2 =  SingletonDesignPattern.getInstance();
		
		System.out.println(pattern1.hashCode());
		
		System.out.println(pattern2.hashCode());
		
		
		

	}

}
