package com.day6.loops;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		if(num<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Positive Number");
		}
		
	}

}
