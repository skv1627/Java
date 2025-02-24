package com.day16.collections;

import java.util.ArrayList;

public class Cloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(35);
		list.add(89);
		list.add(98);
		System.out.println("Original List "+list);
		ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();
		System.out.println("Cloned List "+list1);
		
	}

}
