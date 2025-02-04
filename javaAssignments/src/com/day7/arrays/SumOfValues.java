package com.day7.arrays;

import java.util.Scanner;

public class SumOfValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length=input.nextInt();
		int[] arr = new int[length];
		int add=0;
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			add=arr[i]+add;
		}
		System.out.println("The sum of Array is: "+add);
	}

}
