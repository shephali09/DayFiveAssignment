package com.bridgelabz.basiccoreprograms;

public class FlipCoin {
	public static void main(String[] args) {
		
		int noOfFlips = 50;
		int headCount = 0;
		int tailCount = 0;
		
		
		for(int i=0 ;i<noOfFlips;i++) {
			int result = (int) (Math.floor(Math.random() * 10) % 2);
			if(result == 0) {
				headCount++;
			} else {
				tailCount++;
			}
		}
		
		double headPercent = ((headCount * 100 )/ noOfFlips)  ;
		double tailPercent = (tailCount * 100 / noOfFlips) * 100;
		
		System.out.println("Percentage of head: " +headPercent);
		System.out.println("Percentage of tail: " +tailPercent);
	}

}
