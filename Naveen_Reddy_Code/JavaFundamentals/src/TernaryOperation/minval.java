package TernaryOperation;

import java.util.Scanner;

public class minval {
	
	
	static void mV() {
		// condition = testconditoin ? a:b
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value of a");
		int a = sc.nextInt();		
		
		System.out.println("Please enter value of b");
		int b = sc.nextInt()
;		int minVal = a<b ? a : b;
		System.out.println("Min is : " +minVal);
	}
	
	
	public static void main(String[] args) {
		mV();
	}

}
