package com.bridgelabz.functionalprograms;

public class Distance {

	public static void main(String[] args) {
		
		//declare variables which takes command line argument
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		//calculate distance
		double distance = Math.sqrt((x*x)+(y*y));
		
		//print the distance
		System.out.println("The Euclidean distance from (" + x + ", " + y + ") to the origin is: " + distance);

	}

}
