package com.day7.arrays;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = input.nextInt();
		boolean iscommon=true;
		int[] arr=new int[length];
		int[] duparr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("------------------");
		for(int i=0;i<length;i++) {
			duparr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			for(int j=i;j<length;j++) {
				if(arr[i]==duparr[j]) {
					System.out.println("The common elements are: "+duparr[j]);
					iscommon=false;
				}
			}
		}
		if(iscommon) {
			System.out.println("There's no common elements");
		}
	}

}
