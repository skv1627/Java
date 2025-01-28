package com.day5.loops;

import java.util.Scanner;

public class IncreasedRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int num=0;
		int rows = input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				num+=1;
				System.out.print(num+" ");
			}
			System.out.println();
			
		}
	}

}
