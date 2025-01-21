package com.day3.operators;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Width: ");
		float width = input.nextFloat();
		System.out.print("Height: ");
		float height = input.nextFloat();
		float area=width*height;
		float perimeter=2*(width+height);
		System.out.printf("Area is %.2f\n",area);
		System.out.printf("Perimeter is %.2f\n",perimeter);
		
	}

}
