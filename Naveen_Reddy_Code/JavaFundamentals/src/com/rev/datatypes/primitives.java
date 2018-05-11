package com.rev.datatypes;

public class primitives {
	// int, long, short, byte, double, float, boolean, char
	
	public static void main(String[] args) {
		long lon = 24564646L;
		// inlcude L to say its not integer its a literal
		
		int millions = 1_000_000;
		// underscores can be used after the number to make it look clear
		
		double test = 4.1_44;
		
	// camelcase 
		int thisISCamelCase = 91;
		
		// final 
		final int CONST = 100;
		
		// wrapper class
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// writing hexa number
		// HEX = 0-9, a-f;
		int hex = 0x9ea3;
		int h2 = 0x8AFC;
		int h3 = 0x7AB2C;
		
		//BINARY - only 0's and 1's
		int bin = 0b101010;
		int b = 10101011;
		
		
		// OCTAL - 0- 7 - base 8
		int oct = 0167;
		System.out.println(h2);
		
		// Casting vs Autoboxing
		
		Integer integer = new Integer(10);
		int x = integer;
		
		Integer i2= x+10;
		
		////////
		
		int small = 90;
		short sh = (short) small; // explicit
		long lo = small;// implicit
		System.out.println(small);
		
		// ---------
		
		char ch = 'x';
		char c = 12;
		System.out.println(c);
		
		double doub = small;
		doub = 10;
		System.out.println(doub/4);
		System.out.println(small/4);
		
		
		
		
	}

}
