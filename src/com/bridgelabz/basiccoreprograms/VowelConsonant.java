package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		char alphabet = 'z';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		
		alphabet = scanner.next().charAt(0);
	
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || 
		   alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' ) {
			System.out.println(alphabet +" is vowel");
		} else {
			System.out.println(alphabet +" is consonant");
		}

}
}