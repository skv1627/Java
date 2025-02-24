package com.day16.collections;

import java.util.LinkedList;

public class InsertingAtFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(233);
		list.add(332);
		list.add(87);
		list.add(100);
		System.out.println("Before Inserting "+list);
		list.add(0, 24);
		list.add(3, 87);
		System.out.println("After Inserting "+list);
	}

}
