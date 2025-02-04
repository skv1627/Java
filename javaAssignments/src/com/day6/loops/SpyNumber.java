package com.day6.loops;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int temp=num;
		int a =0;
		int b=0;
		int c =1;
		int len=String.valueOf(num).length();
		for(int i=0;i<len;i++) {
			a = temp%10;
			b=a+b;
			c=a*c;
			temp=temp/10;
		}
		if(b==c) {
			System.out.println("The given number is SpyNumber");
		}else {
			System.out.println("The given number is not a SpyNumber");
		}
		
	}

}
