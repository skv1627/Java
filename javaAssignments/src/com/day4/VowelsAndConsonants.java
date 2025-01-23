package com.day4;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Input an alphabet: ");
		String letter=input.next();
		int length=letter.length();
		
		if(length==1) {
			char l=Character.toLowerCase(letter.charAt(0));
			if(l == 'a'||l=='e'||1=='i'||l=='o'||l=='u') {
				System.out.println("Input letter is Vowel");
			}
			else {
				System.out.println("Input letter is consonant");
			}
		}else {
			System.out.println("Error");
		}
	
	}
}
