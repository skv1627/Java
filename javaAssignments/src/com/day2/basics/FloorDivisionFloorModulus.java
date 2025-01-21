package com.day2.basics;

import java.util.Scanner;

public class FloorDivisionFloorModulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int dividend=input.nextInt();
		System.out.print("Enter the divisor");
		int divisor=input.nextInt();
		if(dividend>0) {
		int value=Math.round(dividend/divisor);
		System.out.println("Floor division: "+value);
		}else {
			int value=Math.round(dividend/divisor)-1;
			System.out.println("Floor division: "+value);
		}
	}
}

	