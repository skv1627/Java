package com.day4;

import java.util.Scanner;

public class VowelsAndConsonantsSwichc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char letter=Character.toLowerCase(input.next().charAt(0));

		if(letter!='a'&& letter!='e'&&letter!='i'&&letter!='o'&&letter!='u') {
		 System.out.println("The letter is consonant");
	}else {
		switch(letter) {
		case 'a':
			System.out.println("The letter is Vowel");
			break;
		case 'e':
			System.out.println("The letter is Vowel");
			break;
		case 'i':
			System.out.println("The letter is Vowel");
			break;
		case 'o':
			System.out.println("The letter is Vowel");
			break;
		case 'u':
			System.out.println("The letter is Vowel");
			break;
		}
	
	}
	}
}
