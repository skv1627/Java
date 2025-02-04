package com.day7.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Length of the Array: ");
			int length=input.nextInt();
			int[] arr=new int[length];
			System.out.println("Enter the numbers");
			for(int i=0;i<length;i++) {
				arr[i]=input.nextInt();
			}
			for(int i=0;i<length-1;i++) {
				for(int j=0;j<length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}

				System.out.print("The second largest number is "+arr[1]);
	}

	}
