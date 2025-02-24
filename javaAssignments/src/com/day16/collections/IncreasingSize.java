package com.day16.collections;

import java.util.ArrayList;

public class IncreasingSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Before increasing the size "+list+" size of the array "+list.size());
		list.add(5);
		list.add(8);
		System.out.println("After increasing the size "+list+" size of the array "+list.size());
	}

}
