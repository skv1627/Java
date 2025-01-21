package com.day2.basics;

import java.util.Scanner;

public class SquareCubeFourthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double value=input.nextDouble();
		double squareValue=Math.pow(value,2);
		double cubeValue=Math.pow(value, 3);
		double fourthValue=Math.pow(value, 4);
		System.out.printf("Square: %.2f\n",squareValue);
		System.out.printf("Cube: %.2f\n",cubeValue);
		System.out.printf("Fourth power: %.2f",fourthValue);
	}

}
