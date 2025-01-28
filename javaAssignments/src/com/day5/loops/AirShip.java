package com.day5.loops;

import java.util.Scanner;

public class AirShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows = input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("......................................");
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
