package com.day6.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		boolean isprime=true;
		if(num<=1) {
			isprime=false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime");
		}
	}

}
