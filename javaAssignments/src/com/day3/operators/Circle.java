package com.day3.operators;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("radius: ");
		double radius=input.nextDouble();
		double perimeter=2*Math.PI*radius;
		double area=Math.PI*Math.pow(radius, 2);
		System.out.printf("Perimeter is = %f\n",perimeter);
		System.out.printf("Area is = %f\n",area);
	}

}
