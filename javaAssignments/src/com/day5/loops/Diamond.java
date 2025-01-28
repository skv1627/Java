package com.day5.loops;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows(half of the diamond) : ");
		int num=1;
		int rows = input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=num;k++) {
				System.out.print("*");
		}
			System.out.println();
			num+=2;
		}
		num=num-4;
		for(int i=1;i<rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}for(int k=1;k<=num;k++) {
				System.out.print("*");
		}
			System.out.println();
			num-=2;
		}
		
	}

}
