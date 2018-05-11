package com.ex.designpatterns;

public class Driver {

	
	public static void main(String[] args) {
		
		Singleton S = Singleton.getInstance();
		
		S.count = 10;
		S.name = "testing";
		System.out.println(S.name);
		
		Singleton two =Singleton.getInstance();
		two.name = "changing name";
		
		System.out.println(S.name);
		
		// Factory design pattern
		
		
		
	}
}
