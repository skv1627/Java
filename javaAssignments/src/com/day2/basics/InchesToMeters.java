package com.day2.basics;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a value for inch: ");
		float inches=input.nextFloat();
		float meter=(float) (inches*0.0254);
		System.out.printf("%.1f inch is %.1f meters",inches,meter);
	}

}
