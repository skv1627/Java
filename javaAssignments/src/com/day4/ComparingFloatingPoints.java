package com.day4;

import java.util.Scanner;

public class ComparingFloatingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input floating-point number: ");
		float num1=input.nextFloat();
		System.out.print("Input another floating-point number: ");
		float num2=input.nextFloat();
		int val1=(int)(num1*1000);
		int val2=(int)(num2*1000);
		if(val1==val2) {
			System.out.println("They are same");
		}else {
			System.out.println("They are different");
		}
		
	}

}
