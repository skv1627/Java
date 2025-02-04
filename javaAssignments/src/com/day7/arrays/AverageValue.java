package com.day7.arrays;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Length of the Array: ");
		int length = input.nextInt();
		int add=0;
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			add=arr[i]+add;
		}
		System.out.print("The average of given array is: "+add/length);
	}

}
