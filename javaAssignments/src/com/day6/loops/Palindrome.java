package com.day6.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int b=0;
		int c=0;
		int temp=num;
		int len=String.valueOf(num).length();
		for(int i=0;i<len;i++) {
			b=temp%10;
			c=(c+b)*10;
			temp=temp/10;
		}
		c=c/10;
		System.out.println(c);
		if(c==num) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Its not a palindrome");
		}
		
		
		
	}

}
