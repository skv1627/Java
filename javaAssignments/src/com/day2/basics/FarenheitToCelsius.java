package com.day2.basics;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		int degree=input.nextInt();
		float f=(float)degree;
		float c=(float) ((5.0/9.0)*(f-32.0));
		System.out.printf("%.1f degree fahrenheit is equal to %.1f in clesius",f,c);
	}

}
