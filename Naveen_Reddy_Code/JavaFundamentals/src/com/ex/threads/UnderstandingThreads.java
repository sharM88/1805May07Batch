package com.ex.threads;

public class UnderstandingThreads {
	//A thread is a line of execution
	// Multithreading in java is more than one thread executing at same time
	
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.println("in main loop" + i);
		}
		looping();
	}
	static void looping() {
		for(int i=0;i<20;i++) {
			System.out.println("in looping loop"+ i);
		}
	}

}
