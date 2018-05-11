package com.rev.datatypes;
import java.lang.*;
import java.util.Arrays;

public class UnderstandingArrays {

	
	public static void main(String[] args) {
		
		int [] arr = new int[4];
		arr[0]=5;
		
		try{
			arr[10]=44;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Exceptions area caught");
		}
			
		}
		
	
		
		// two dimentional arrays
		
		
		
		
	}

