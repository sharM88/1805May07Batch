package com.ex.Strings;

public class UnderstandingStrings {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b ="Hello";
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		
		System.out.println(a.equals(c));
		
		
		System.out.println(c.equals(d));
		
		System.out.println(c==d);
		
		System.out.println("Hello"+"Hello" == "Hello" + " Hello ");
		
		
		/*
		 * StringBuilder is used to append, add, or delete or insert 
		 * append is used to add elements as shown below
		 */
		
		StringBuilder build = new StringBuilder(" Reddy ");
		build.append(" Naveen ").reverse();
		System.out.println(build);
	}

}
