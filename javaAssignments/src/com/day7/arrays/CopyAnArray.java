package com.day7.arrays;

import java.util.Scanner;

public class CopyAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length=input.nextInt();
		int[] arr=new int[length];
		int[] newarr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			newarr[i]=arr[i];
		}
		for(int j=0;j<length;j++) {
			System.out.print(newarr[j]+" ");
		}
	}

}
