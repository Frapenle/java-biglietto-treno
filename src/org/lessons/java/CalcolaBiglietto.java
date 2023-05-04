package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Insert km to run: ");
		double km = userInput.nextInt();
		
		System.out.print("Insert your age: ");
		int age = userInput.nextInt();
		
		double ticketPrice = km * 0.21;
		
		if (age < 18) {
			double discount = ticketPrice * 20 / 100;
			ticketPrice = ticketPrice - discount;
			System.out.println("Total price: " + ticketPrice + "euro");
			
		} else if (age > 65){
			double discount = ticketPrice * 40 / 100;
			ticketPrice = ticketPrice - discount;
			System.out.println("Total price: " + ticketPrice + "euro");
			
		} else {
			System.out.println("Total price: " + ticketPrice + "euro");
		}
	}
}
