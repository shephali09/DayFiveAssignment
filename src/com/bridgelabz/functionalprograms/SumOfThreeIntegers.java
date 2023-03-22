package com.bridgelabz.functionalprograms;

/*A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0. Output is number of distinct triplets.*/

import java.util.Scanner;

public class SumOfThreeIntegers {

	public static void main(String[] args) {

		// initialize the array
		int array[] = { 2, 1, -3, 4, 2, 8 };
		int number = array.length;

		// call the function
		findTriplets(array, number);

	}

	public static void findTriplets(int array[], int number) {

		int i, j, k;

		// count the number of triplets that sum to exactly 0
		boolean isFound = false;
		for (i = 0; i < number - 2; i++) {
			for (j = i + 1; j < number - 1; j++) {
				for (k = j + 1; k < number; k++) {
					if (array[i] + array[j] + array[k] == 0) {

						System.out.println(array[i] + array[j] + array[k]);
						isFound = true;

					}

				}
			}

		}
		// If triplets that sum to exactly 0 are not exist then print the message
		if (isFound == false)
			System.out.println("Not exist");

	}
}
