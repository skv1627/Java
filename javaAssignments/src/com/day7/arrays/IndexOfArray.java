package com.day7.arrays;

import java.util.Scanner;

public class IndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = input.nextInt();
		System.out.print("Enter the value you want to find index of: ");
		int value=input.nextInt();
		int temp=0;
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			if(arr[i]==value) {
				temp=i;
			}
		}
		System.out.println("The index of "+value+" is "+temp);
	}

}
