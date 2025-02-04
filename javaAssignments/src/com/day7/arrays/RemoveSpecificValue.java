package com.day7.arrays;

import java.util.Scanner;

public class RemoveSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length=input.nextInt();
		int[] arr=new int[length];
		System.out.print("Enter the value to be removed: ");
		int value=input.nextInt();
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			if(arr[i]==value) {
				length-=1;
				for(int j=i;j<length;j++) {
				arr[j]=arr[j+1];
			}
		}
		}
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
