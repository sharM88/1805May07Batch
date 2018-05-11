package com.ex.triangle;

public class Triangle {
	
	// patterns can be created by using loops
	// we can make use of inner loops and outer loops to get required pattern
	
	public static void main(String[] args) {
		
		int x =0;
		int y =1;
		
		for(int i =x; i<=y;i++) {
			for(int j =y; j<2;j++) {
				System.out.print(j);
			}System.out.println(i);
			
		}
			
			
		}
		
	}

/*
 *   0
  *  1 0
   * 1 0 1
    *0 1 0 1
*/
