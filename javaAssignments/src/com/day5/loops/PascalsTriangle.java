package com.day5.loops;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int rows = input.nextInt();
		int temp=1;
		int val =11;
		int div=0;
		for(int i=0;i<rows;i++) {
			div=(int)Math.pow(val, i);
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				temp=div%10;
				System.out.print(temp+" ");
				div=div/10;		
			}
			System.out.println();
		}
		
	}

}
