package com.day5.loops;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Input the 5 numbers : ");
		int val=0;
		int sum=0;
		for(int i=1;i<=5;i++) {
			val=input.nextInt();
			sum=sum+val;
		}
		System.out.printf("The sum of 5 no is : %d\n",sum);
		System.out.printf("The Average is : %d",sum/5);
	}

}
