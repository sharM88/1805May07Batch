package EvenInteger;

import java.util.Scanner;

public class Even {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// By dividing with two we can find if the integer is odd or even
		isOddorEven();
	}
	
	static void isOddorEven() {
		System.out.println("enter the number");
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		int quotient = number/2;
		
		if(number == quotient*2) {
			System.out.println("Entered number " +number + " is EVEN");
		}else {
			System.out.println("Entered number is ODD");
		}
	}
	
	 

}
