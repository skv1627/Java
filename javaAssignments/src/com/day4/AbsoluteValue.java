package com.day4;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		float num=input.nextFloat();
		float negNum;
		if(num>0) {
			System.out.println("Positive number");
			if(num>1000000) {
				System.out.println("large");
			}
		}else if(num<0) {
			System.out.println("Negative number");
			negNum=num-2*num;
			if(negNum>1000000) {
				System.out.println("large");
			}
		}else {
			System.out.println("zero\n"+"small");
		}
		
	}

}
