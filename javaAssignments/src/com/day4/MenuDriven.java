package com.day4;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the choice to perform operations:");
		System.out.print("1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n");
		int operation = input.nextInt();
		System.out.print("Enter the first number: ");
		int a = input.nextInt();
		System.out.print("Enter the second number: ");
		int b = input.nextInt();
		switch(operation) {
		case 1: 
			System.out.println(a+b);
			break;
		case 2: 
			System.out.println(a-b);
			break;
		case 3: 
			System.out.println(a*b);
			break;
		case 4: 
			System.out.println(a/b);
			break;
			
		}
	}

}
