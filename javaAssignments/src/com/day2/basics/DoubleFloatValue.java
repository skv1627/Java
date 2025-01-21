package com.day2.basics;

import java.util.Scanner;

public class DoubleFloatValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value: ");
		double value=input.nextDouble();
		if(Double.isFinite(value)) {
			System.out.println("The given value is finite value");
		}else {
			System.out.println("The given value is infinite value");
		}
	}

}
