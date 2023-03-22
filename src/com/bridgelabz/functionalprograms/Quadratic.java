package com.bridgelabz.functionalprograms;

/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a) */

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		double a, b, c;
		// Input a,b,c from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c:");

		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();

		// calculate delta using formula
		double delta = b * b - 4 * a * c;

		// find roots of the equation
		if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The roots of the equation are " + root1 + " and " + root2);
		} else if (delta == 0) {
			double root = -b / (2 * a);
			System.out.println("The root of the equation is " + root);
		} else {
			System.out.println("The equation has no roots");
		}
	}

}
