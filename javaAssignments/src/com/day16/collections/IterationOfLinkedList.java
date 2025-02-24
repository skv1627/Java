package com.day16.collections;

import java.util.LinkedList;

public class IterationOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
