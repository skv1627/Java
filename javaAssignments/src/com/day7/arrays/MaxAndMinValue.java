package com.day7.arrays;

import java.util.Scanner;

public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = input.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the values:");
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			if(arr[i]<=min) {
				min=arr[i];
			}
		}
		System.out.println("The max Value in the array is: "+max);
		System.out.print("The min Value in the array is: "+min);
	}

}
