package com.day16.collections;

import java.util.Collections;
import java.util.LinkedList;

public class Shufling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		System.out.println("Before Shuffling "+list);
		Collections.shuffle(list);
		System.out.println("After Shuffling "+list);
	}

}
