package com.day16.collections;

import java.util.LinkedList;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		System.out.println("Before removing "+list);
		list.clear();
		System.out.println("Aftre Removing "+list);
	}

}
