package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
//		user number input
		Scanner userNumber = new Scanner(System.in);
		System.out.println("Insert number between 1 and 1000 ");
		int number = userNumber.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
		userNumber.close();
	}
}
