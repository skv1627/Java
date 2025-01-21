package com.day3.operators;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = input.nextInt();
		System.out.print("Input Second number: ");
		int b = input.nextInt();
		System.out.printf("%d x %d = %d",a,b,a*b);
	}

}
