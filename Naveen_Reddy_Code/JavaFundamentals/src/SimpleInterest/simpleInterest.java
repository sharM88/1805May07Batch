package SimpleInterest;

import java.util.Scanner;

public class simpleInterest {

	
	
	// Interest = Principal* Rate* Time
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SI();

	}
	
	// create a method to get the Simple interest using the formula mentioned above
	// This method can be called in main method once finished with the user inputs followed by the formula
	
	static void SI() {
		// Interest = Principal* Rate* Time
		// rate - float, 
		
		
		float interest;
		float principal;
		float rate;
		int time; // In months
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your Principal amount");
		principal = sc.nextFloat();
		
		System.out.println("Please enter your rate ");
		rate = sc.nextFloat();
		
		System.out.println("Please enyer your time(No.of months)");
		time = sc.nextInt();
		
		
		interest = principal*rate*time;
		
		System.out.println("Interest for the data provided is :" + interest);
				
	}

}
