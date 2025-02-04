package com.day6.loops;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		if(num%10==7||num%7==0) {
			System.out.println("The given number is Buzz Number: ");
		}else {
			System.out.println("The given number is not a Buzz Number: ");
		}
		
	}

}
