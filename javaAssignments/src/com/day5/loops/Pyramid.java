package com.day5.loops;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows = input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
