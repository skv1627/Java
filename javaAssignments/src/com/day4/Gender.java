package com.day4;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Gender: ");
		char gender=Character.toLowerCase(input.next().charAt(0));
		switch(gender){
		case 'm':
			System.out.println("Male");
			break;
		case 'f':
			System.out.println("female");
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
