package com.day4;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the 1st number: ");
		int a = input.nextInt();
		System.out.print("Input the 2nd number: ");
		int b = input.nextInt();
		System.out.print("Input the 3rd number: ");
		int c = input.nextInt();
		if(a>b&&a>c) {
			 System.out.printf("The greatest: %d",a);
		}else if(b>a&&b>c) {
			System.out.printf("The greatest: %d",b);
		}else {
			System.out.printf("The greatest: %d",c);
			
		}
		
	}

}
