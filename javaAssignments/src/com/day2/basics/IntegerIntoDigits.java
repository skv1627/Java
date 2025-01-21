package com.day2.basics;

import java.util.Scanner;

public class IntegerIntoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input six non-negative digits: ");
		float value=input.nextInt();
		float temp;
		temp=value/100000;
		for(int j=0;j<6;j++) {
			temp=temp/10;
			temp=temp*10;
			System.out.print((int)temp+" ");
			int num=(int)temp;
			temp=(temp-num)*10;
		}
		
	}

}
		
