package com.day6.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int temp=0;
		int num = input.nextInt();
		temp=num;
		System.out.printf("%d! = ",num);
		System.out.print(temp+"*");
		for(int i=num-1;i>=1;i--) {
			temp=temp*i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print(i+"*");
			}
			
		}
		System.out.print("= "+temp);
	}

}
