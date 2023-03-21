package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
			   //Variables are declared.
				int numberOne, numberTwo,temp;
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter numberOne and numberTwo for swapping : ");
				numberOne = scanner.nextInt();
				numberTwo = scanner.nextInt();
				
				//print the values before swapping of numbers
				System.out.println("Before swapping: "+numberOne + " and " +numberTwo);
				
				//swap the numbers
				temp=numberOne;
				numberOne=numberTwo;
				numberTwo=temp;
				
				//print the values after swapping of numbers
				System.out.println("After swapping: "+numberOne + " and " +numberTwo);
			}

	}


