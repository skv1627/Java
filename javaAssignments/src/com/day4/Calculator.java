package com.day4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the operation to be performed: ");
		char symbol=input.next().charAt(0);
		System.out.print("Enter the first number: ");
		int a=input.nextInt();
		System.out.print("Enter the second number: ");
		int b=input.nextInt();
		
		switch(symbol) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		}
	}

}
