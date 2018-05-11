package com.ex.factorial;

public class Nfactorial {
	
	
	// formula for N factorial is N! = N* (N-1)! 4!=4*3*2*1
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=1;
		int number = 5;
		
		for(int i=1;i<=number;i++) {
			
			N=i*number;
			
		}System.out.println("Factorial of given Number is: " + N);
	}

}
