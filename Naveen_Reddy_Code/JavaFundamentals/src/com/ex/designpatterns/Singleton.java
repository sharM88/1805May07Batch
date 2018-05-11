package com.ex.designpatterns;

// 
public class Singleton {
	
	private static Singleton singleton  = new Singleton();
	 int count;
	 String name;
	// key element of singleton designpettern - private constructor
	private Singleton() {
		super();
		
		
	}

	
	public static Singleton getInstance() {
		return singleton;
	}
}