package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swarna");
		list.add("Kumar");
		list.add("Venom");
		System.out.println("Before Swapping "+list);
		Collections.swap(list, 1, 0);
		System.out.println("After Swapping");
		System.out.println(list);
	}

}
