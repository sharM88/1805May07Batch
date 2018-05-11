package com.ex.accessmodifier2;


import com.ex.accessmodifier.AccessVariableFromAnotherClass;

public class AccessVariableFromAnotherClassDiffPkg {

	public static void main(String[] args) {
		
		AccessVariableFromAnotherClass class1 = new AccessVariableFromAnotherClass();
		
		System.out.println("Float value of f is :" + class1.f);
		
	}
	
	
	
}
