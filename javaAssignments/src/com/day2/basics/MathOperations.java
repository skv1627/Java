package com.day2.basics;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int a=input.nextInt();
		System.out.print("Input 2nd integer: ");
		int b=input.nextInt();
		System.out.print("Sum of two integers: "+(a+b)+"\n");
		System.out.print("Difference of two integers: "+(Math.max(a, b)-Math.min(a, b))+"\n");
		System.out.print("Product of two integers: "+(a*b)+"\n");
		System.out.print("Average of two integers: "+((float)((a+b)/2))+"\n");
		System.out.print("Distance of two integers: "+(Math.max(a, b)-Math.min(a, b))+"\n");
		System.out.print("Max integer: "+Math.max(a, b)+"\n");
		System.out.print("Min integer: "+Math.min(a, b));
		
	}

}
