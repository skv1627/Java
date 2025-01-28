package com.day5.loops;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of terms : ");
		int num = input.nextInt();
		for(int i=1;i<=4;i++) {
			int cube=(int) Math.pow(i,3);
			System.out.printf("Number is : %d and cube of %d is : %d\n",i,i,cube);
		}
		

	}

}
