package com.day5.loops;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number: ");
		int rows = input.nextInt();
		int num=1;
		int temp=0;
		for(int i=1;i<=rows;i++) {
			temp=i;
			int sec=2;
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=num;k++) {
				System.out.print(temp);
				temp-=1;
			}int x=sec;
			for(int l=1;l<num;l++) {
				System.out.print(x);
				x+=1;
				}		
			num+=1;
			System.out.println();
		}int r=rows-1;
		num-=1;
		for(int i=1;i<rows;i++) {
			temp=r;
			int sec=2;
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}for(int k=1;k<num;k++) {
				System.out.print(temp);
				temp-=1;
			}r-=1;
			int x=sec;
			for(int l=2;l<num;l++) {
				System.out.print(x);
				x+=1;
				}		
			num-=1;
			System.out.println();
		}
		
	}
}

