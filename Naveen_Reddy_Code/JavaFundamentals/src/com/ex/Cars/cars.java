package com.ex.Cars;

public class cars {
	
	// static fields which are kept constant and same for all the cars
	static int speed;
	static String maker;
	static String color;
	static String EngineMode;
	static String model;
	
	// below mentioned are methods which varies for different cars
	static void maker() {
		System.out.println("Maker of the car is " + maker);
	}
	
	static void model() {
		System.out.println("Model of the car is " + model);
	}
	static void color() {
		System.out.println("Color of the car is "+ color);
	}
	static void EngineMode() {
		System.out.println("Current status of engine is "+ EngineMode);
	}
	static void speed() {
		if(speed<=55) {
			System.out.println("Your speed is under limit and maintain the same");
		}
		else {
			System.out.println("Please reduce the speed to a safe speed limit");
		}
	}
	
	
	public static void main(String[] args) {
		benz();
		System.out.println("-------------------");
		nissan();
		}
	
	
	static void benz() {
		cars benz = new cars();
		
		benz.maker="Benz";
		maker();
		
		benz.model="S550";
		model();
		
		benz.color="Black";
		color();
		
		benz.EngineMode="Started";
		EngineMode();
		
		benz.speed=57;
		speed();
		
	}
	
	static void nissan() {
		cars nissan = new cars();
		
		nissan.maker= "Nissan";
		maker();
		
		nissan.model="Altima";
		model();
		
		nissan.color="Yellow";
		color();
		
		nissan.EngineMode="Started";
		EngineMode();
	}

		
}
