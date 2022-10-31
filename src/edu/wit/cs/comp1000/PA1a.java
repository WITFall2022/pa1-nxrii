package edu.wit.cs.comp1000;
//TODO: document this class

import java.util.Scanner;

public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here

		Scanner input = new Scanner(System.in);
		
		int yards;
		int feet;
		int inches;
		
		System.out.printf("Enter amount of yards as a whole number:");
		yards = input.nextInt();
		
		System.out.printf("Enter amount of feet as a whole number:");
		feet = input.nextInt();
		
		System.out.printf("Enter amount of inches as a whole number:");
		inches = input.nextInt();
		
		int ans;
		ans = feet*12+yards*36+inches;
		System.out.print(ans);
	
	}

}
