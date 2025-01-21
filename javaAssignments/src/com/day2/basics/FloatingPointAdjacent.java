package com.day2.basics;

import java.util.Scanner;

public class FloatingPointAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float num=input.nextFloat();
		System.out.println(Math.nextUp(num));
		System.err.println(Math.nextDown(num));
		
	}

}
