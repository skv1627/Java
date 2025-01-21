package com.day2.basics;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input weight in pounds: ");
		float weight=input.nextFloat();
		System.out.print("Input height in inches: ");
		float height=input.nextFloat();
		float bmi=(weight/(height*height))*703;
		System.out.print("Body Mass Index is "+bmi);
		
	}

}
