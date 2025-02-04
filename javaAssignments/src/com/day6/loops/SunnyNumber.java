package com.day6.loops;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=input.nextInt();
		int value=num+1;
		double sqrt=Math.sqrt(value);
		if(sqrt==Math.floor(value)) {
			System.out.println("The given number is Sunny Number");
		}
		else {
			System.out.println("The given number is not a Sunny Number");
		}
		
	}

}
