package com.day16.collections;

import java.util.LinkedList;

public class InsertionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println("Before inserting: "+list);
		list.add(2, 10);
		System.out.println("After Inserting "+list);
	}

}
