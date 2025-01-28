package com.day5.loops;

import java.util.Scanner;

public class InvertedRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number: ");
		int rows = input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}for(int k=rows;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
