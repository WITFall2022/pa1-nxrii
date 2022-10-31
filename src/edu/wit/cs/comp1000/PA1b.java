package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here

		Scanner input = new Scanner(System.in);
		
		int inches;
		System.out.printf("Enter the amount of inches as a whole number:");
		inches = input.nextInt();
		
		int yards = inches/ 36;
		int inches1 = inches % 36;
		int feet = inches1 / 12;
		int inches2 = inches % 12;
		
		System.out.printf("yards: %d%n" , yards);
		System.out.printf("feet: %d%n" , feet);
		System.out.printf("inches: %d%n" , inches1);
	}

}
