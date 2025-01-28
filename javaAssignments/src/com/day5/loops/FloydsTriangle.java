package com.day5.loops;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int rows = input.nextInt();
		int num=0;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				num+=1;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
