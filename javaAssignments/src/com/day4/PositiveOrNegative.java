package com.day4;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		int num = input.nextInt();
		if(num>0) {
			System.out.println("Number is positive");
		}else if(num<0){
			System.out.println("Number is Negative");
		}
		else{
			System.out.println("Neither positive nor Negative");
		}
		
	}
}
