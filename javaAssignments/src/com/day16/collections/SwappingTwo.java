package com.day16.collections;

import java.util.Collections;
import java.util.LinkedList;

public class SwappingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		System.out.println("Before Swapping: "+list);
		Collections.swap(list, 3, 1);
		System.out.println("After Swapping "+list);
	}

}
