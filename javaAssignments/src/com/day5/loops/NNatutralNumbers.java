package com.day5.loops;

import java.util.Scanner;

public class NNatutralNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input number:");
		int num=input.nextInt();
		System.out.println("The first n natural numbers are :");
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		System.out.println("The sum of Natural Numbers upto n terms :");
		int result=num*(num+1)/2;
		System.out.println(result);
	}

}
