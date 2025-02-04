package com.day6.loops;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[2];
		System.out.print("Enter the first number: ");
		array[0]=input.nextInt();
		System.out.print("Enter the second number: ");
		array[1]=input.nextInt();
		System.out.println("The numbers before swapping: ");
		System.out.println(array[0]);
		System.out.println(array[1]);
		for(int i=0;i<1;i++) {
			array[i]=array[i]^array[i+1];
			array[i+1]=array[i]^array[i+1];
			array[i]=array[i]^array[i+1];
		}
		System.out.println("The numbers after swapping: ");
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

}
