package com.day2.basics;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer between 0 and 1000: ");
		int value=input.nextInt();
		temp=value;
		int b=0;
		for(int i=0;i<4;i++) {
			int a=temp%10;
			temp=temp/10;
			b=a+b;
		}
		System.out.printf("The sum of all digits in %d is %d",value,b);
				
	}

}
