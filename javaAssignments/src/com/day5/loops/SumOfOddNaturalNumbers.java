package com.day5.loops;

import java.util.Scanner;

public class SumOfOddNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of terms is: \n");
		int val = input.nextInt();
		int temp=1;
		System.out.println("The odd numbers are : ");
		
		for(int i=1;i<=val;i++) {
			System.out.println(temp);
			temp=temp+2;
			
			
		}
	}

}
