package com.ex.designpatterns.dao;

import java.util.Scanner;

import com.ex.designpatterns.dao.Student.*;
public class App {
	
	// main class to run student app
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.nextLine();		
		
		System.out.println("Entered username is " + username);
		
		System.out.println("Please enter the password");
		String password= sc.nextLine();		
		System.out.println("Password Entered");
		
	}

}
