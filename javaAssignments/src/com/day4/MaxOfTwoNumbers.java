package com.day4;

import java.util.Scanner;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = input.nextInt();
		System.out.print("Enter the second number: ");
		int b = input.nextInt();
		switch(Integer.compare(a, b)) {
		case 0:
			System.out.println("Both are same");
		case 1:
			System.out.println("a is greater");
		case -1:
			System.out.println("b is greater");
		}
	}

}
