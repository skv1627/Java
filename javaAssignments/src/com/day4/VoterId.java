package com.day4;

import java.util.Scanner;

public class VoterId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = input.nextInt();
		switch(age) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 17:
			System.out.println("Not Eligible to Vote");
			break;
		default:
			System.out.println("Eligible to vote");
		}
		
	}

}
