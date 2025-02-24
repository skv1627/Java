package com.day16.collections;

import java.util.LinkedList;

public class EndOfLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("My");
		list.add("Name");
		list.add("is");
		list.add("Swarna");
		System.out.println("Before insertion "+list);
		list.add(4, "kumar");
		System.out.println("After insertion "+list);
	}

}
