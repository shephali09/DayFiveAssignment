package com.bridgelabz.functionalprograms;

/*write a java program to Print function 
 * to print 2 Dimensional Array.*/

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		//function call
		print2DArray();
	
	}
	
	public static void print2DArray() {
		
		//user input of elements of array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rowLength = scanner.nextInt();

        System.out.println("Please enter number of columns");
        int columnLength = scanner.nextInt();

        int array[][] = new int[rowLength][columnLength];
        
        //enter the elements into array
        System.out.println("Please enter array elements");
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        //print array elements
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}
}