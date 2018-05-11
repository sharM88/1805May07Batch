package com.ex.bubblesort;

public class bubbleSort {

	// BubbleSort is a method 
	static void BubbleSort(int[]arr) {
		int n = arr.length;
		
		// need to use two loops in case of bubble sort to swap the numbers
		for(int i=0;i<n-1;i++)
			for(int j= 0; j<n-1;j++)
				if(arr[j]>arr[j+1])
			{
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
			}
	}
	 /* Prints the array */
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 // Main method begins here
	public static void main(String[] args) {
		bubbleSort ob = new bubbleSort();
		int arr[] = {1,0,5,6,3,2,3,7,9,8,4};
		ob.BubbleSort(arr);
		 System.out.println("Sorted array");
	        ob.printArray(arr);
	

}}
