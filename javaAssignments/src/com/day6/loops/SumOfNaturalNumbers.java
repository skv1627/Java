package com.day6.loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int temp=0;
		for(int i=1;i<=num;i++) {
			temp=i+temp;
		}
		System.out.println(temp);
	}

}
