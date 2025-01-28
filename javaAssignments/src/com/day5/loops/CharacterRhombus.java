package com.day5.loops;

import java.util.Scanner;

public class CharacterRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number: ");
		int rows = input.nextInt();
		char temp = 0;
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print((char)('A'+ k-1));
			}
			for(int l=i-1;l>=1;l--) {			
				System.out.print((char)('A' + l-1));
				}		
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--) {
			for(int j=rows;j>=i;j--) {
			System.out.print(" ");
		}	for(int k=1;k<=i;k++) {
			System.out.print((char)('A'+ k-1));
		}
			for(int l=i-1;l>=1;l--) {			
			System.out.print((char)('A' + l-1));
			}		
		System.out.println();
	}
		
	}
}

