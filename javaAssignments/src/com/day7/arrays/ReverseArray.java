package com.day7.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length=input.nextInt();
		int v=length-1;
		int temp=0;
		int[] arr= new int[length];
		int[] revarr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			revarr[i]=arr[v];
			v-=1;
		}
		for(int i=0;i<length;i++) {
			System.out.print(revarr[i]+" ");
		}
	}

}
