package com.day3.operators;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int average = (a+b+c)/3;
		System.out.printf("Average of three numbers is : %d",average);
	}

}
