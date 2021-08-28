package com.demo.design;


public class SingletonDesignPattern {
	
	
	//no one is supposed to create object directly
	private SingletonDesignPattern(){
		
	}
	
	private static SingletonDesignPattern pattern =new SingletonDesignPattern();
	
	
	
	/**
	 * @return
	 * purpose of this method to return the same object every time
	 */
	public static SingletonDesignPattern getInstance(){
		return pattern;
	}
	
	
	
	

}
