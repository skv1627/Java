package com.day6.loops;

import java.util.Scanner;

public class KrishnaMurthyNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number to check whether it is peterson number or not: ");
			int num=input.nextInt();
			int temp=num;
			int b=0;
			int c=0;
			int add=0;
			int n=0;
			int len=String.valueOf(num).length();
			for(int i=1;i<=len;i++) {
				b=temp%10;
				temp=temp/10;
				if(b==1||b==0) {
					b=1;
					n=b;
				}else {
					n=b-1;
				}
				for(int j=n;j>=1;j--) {
					b=b*j;
					c=b;
				}
				add=c+add;		
			}
			if(add==num) {
			System.out.println("Its a peterson number");
		}else {
			System.out.println("Its not a peterson number");
		}
		}
	}

