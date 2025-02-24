package com.day16.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(10);
		list.add(45);
		System.out.println("Before Sorting: "+list);
		System.out.println("After Sorting ");
		Collections.sort(list);
		System.out.println(list);

	}

}
