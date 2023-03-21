package com.bridgelabz.basiccoreprograms;

/*Write a java program to print a table of powers 
 * of 2 that are less than or equal to 31*/

public class PowerOfTwo {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(args[0]);
		int i,power = 0;
		
		System.out.println("Table of power of 2");
		System.out.println("-------------------");
		if(number <= 31) {
		for(i=0;i<=number;i++) {
			power = (int) Math.pow(2,i);
			System.out.println(i+ "\t" +power +"\n");
		}
		System.out.println("The power of number is within range");
		} else {
			System.out.println("The power of number is greater than 31");
		}
	}
}
