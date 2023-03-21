package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		double number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		
		double harmonicNumber = 0;
		for(double i=1;i<=number;i++) {
			harmonicNumber = harmonicNumber + (1 / i);
			System.out.print((1)+"/"+i+"+");
		}
		System.out.println("\nThe "+number+"th harmonic number is: "+harmonicNumber);
	}
}
