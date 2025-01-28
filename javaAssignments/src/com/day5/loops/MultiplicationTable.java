package com.day5.loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number (Table to be calculated) : \n");
		int table = input.nextInt();
		System.out.print("Input number of terms : ");
		int term = input.nextInt();
		for(int i=0;i<=term;i++) {
			System.out.printf("%d x %d = %d\n",table,i,table*i);
		}
	}

}
