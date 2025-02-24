package com.day16.collections;

import java.util.LinkedList;

public class FrontInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Name");
		list.add("is");
		list.add("Kumar");
		System.out.println("Before insertion "+list);
		list.add(0, "My");
		System.out.println("After insertion "+list);
	}

}
