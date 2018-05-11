package com.ex.classes;

public class ClassBasics {
	
	// INSTANCE vars
	int a;
	double b;
	String c;
	
	// constructor can also be created as mentioned below
	public ClassBasics(int a2, double b2, String c2) {
		super();
		a=a2;
		this.b=b2;
		this.c = c2;
	}
	
	public ClassBasics() {
		this(5,2,"test");
	}

}
