package com.ex.rString;

import java.util.Scanner;

public class ReverseString {
	
	// by using for loop we can obtain this reverse of a string
	
	static void rstr()
	{
		System.out.println("Enter a String ");
		
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		String reverse = "";
		for(int i = str.length()-1 ; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			
		}System.out.println(reverse);
	}
	public static void main(String[] args) {
		rstr();
	}

}
