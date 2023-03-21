package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		double divident,divisor,quotient,remainder;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter divident and didvisor: ");
		divident = scanner.nextDouble();
		divisor = scanner.nextDouble();
		
		quotient = divident / divisor;
		remainder = divident % divisor;
		
		System.out.println("The quotient is: " + quotient);
		System.out.println("The remainder is: " + remainder);
	}

}
