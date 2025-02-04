package com.day6.loops;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=input.nextInt();
		int len= String.valueOf(num).length();
		System.out.print("The reverese number is ");
		for(int i=0;i<len;i++) {
			int a = num%10;
			System.out.print(a);
			num=num/10;
		}
	}

}
