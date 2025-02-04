package com.day6.loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check whether it is Automorphic or not: ");
		long a=0;
		long val=0;
		long temp=0;
		long num = input.nextLong();
		long square=num*num;
		int len=String.valueOf(num).length();
		for(int i=1;i<=len;i++) {
			a=square%10;
			val=(val+a)*10;
			square=square/10;
		}
		
		val=val/10;
		for(int j=1;j<=len;j++) {
			a=val%10;
			temp=(temp+a)*10;
			val=val/10;
		}
		temp=temp/10;
		if(num==temp) {
			System.out.println("Its an Automorphic Number");
		}else {
			System.out.println("Its not an Automorphic Number");
		}
	}

}
