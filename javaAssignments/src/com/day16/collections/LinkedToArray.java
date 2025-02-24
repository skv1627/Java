package com.day16.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		System.out.println("Linked List: "+list);
		ArrayList<String> list1 = new ArrayList<>(list);
		System.out.println("Array List: "+ list1);
	}

}
