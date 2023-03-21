package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int numberOne, numberTwo,numberThree;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		numberOne = scanner.nextInt();
		numberTwo = scanner.nextInt();
		numberThree = scanner.nextInt();
		
		if((numberOne > numberTwo) && (numberOne > numberThree)) {
			System.out.println(numberOne + " is greater");
		} else if((numberTwo > numberOne) && (numberTwo > numberThree)) {
			System.out.println(numberTwo + " is greater");
		}else {
			System.out.println(numberThree + " is greater");
		}
	}

}
