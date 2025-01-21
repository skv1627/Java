package com.day3.operators;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d\n",num,i,num*i);
		}
	}

}
