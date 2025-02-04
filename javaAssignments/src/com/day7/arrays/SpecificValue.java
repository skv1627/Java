package com.day7.arrays;

import java.util.Scanner;

public class SpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length=input.nextInt();
		int[] arr=new int[length];
		int temp=0;
		System.err.print("Enter the value to be looked for: ");
		int val=input.nextInt();
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			if(arr[i]==val) {
				temp=arr[i];
			}
		}
		if(temp==val) {
			System.out.println("The Array has specified value");
		}else {
			System.out.println("The Array doesn't have specified value");
		}
		
	}

}
