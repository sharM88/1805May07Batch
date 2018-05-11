package com.rev.exercises;

public class Fibonacci {
	
	
	
	// Main method starts here
	
	public static void main(String[] args) {
		
		// Declaring variables and intitializing them with values
		int count=25;
		int num1 =0;
		int num2=1;
		
		// Making use of while loop to repeat the loop untill given condition satisfies
		int i=1;
		while(i<=count) {
			System.out.print(num1+" ");
			// Below mentioned is the formula or statements to obtain fibonacci numbers 
			int sumOfprev = num1 + num2;
			num1=num2;
			num2 = sumOfprev ;
			i++;
		}
	}

	
}




