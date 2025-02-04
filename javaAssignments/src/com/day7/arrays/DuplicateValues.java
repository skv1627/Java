package com.day7.arrays;

import java.util.Scanner;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = input.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate value is: "+arr[j]+" ");
				}
			}
		}
	}

}
