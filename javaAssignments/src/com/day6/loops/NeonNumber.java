package com.day6.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int a=0;
		int temp=0;
		int square = num*num;
		int len = String.valueOf(square).length();
		for(int i=0;i<len;i++) {
			a=square%10;
			temp=a+temp;
			square=square/10;
		}
		if(temp==num) {
			System.out.println("The given number is Neon Number");
		}else {
			System.out.println("The given number is not a Neon Number");
		}
	}

}
