package com.day5.loops;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows : ");
		int val = input.nextInt();
		for(int i=1;i<=val;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
