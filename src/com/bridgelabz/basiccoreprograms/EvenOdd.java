package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check whether it is even or odd: ");
		
		number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number+ " is even.");
		} else {
			System.out.println(number+ " is odd.");	
		}
	}

}
