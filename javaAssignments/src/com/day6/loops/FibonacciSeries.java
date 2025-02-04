package com.day6.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of terms to print: ");
		int len = input.nextInt();
		int k=0;
		int a=0;
		int b=1;
		if(len==0) {
			System.out.print("error");
		}else if(len==1) {
			System.out.print(a);
		}else if(len==2) {
			System.out.print(a+", "+b);
		}else {
			System.out.print(a+", ");
		for(int i=0;i<len;i++) {
			k=a+b;
			System.out.print(k+", ");
			b=a;
			a=k;	
			
		}
		}
		
	}

}
