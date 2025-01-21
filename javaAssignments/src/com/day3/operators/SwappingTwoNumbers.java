package com.day3.operators;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		System.out.printf("Numbers before Swapping: a = %d and b = %d\n",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("Numbers after Swapping: a = %d and b = %d",a,b);
		
	}

}
