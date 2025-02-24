package com.day16.collections;

import java.util.LinkedList;

public class ReversedIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Name");
		list.add("Swarna");
		list.add("Kumar");
		list.add("Nandha");
		System.out.println(list);
		for(int i=list.size();i>0;i--) {
			System.out.println(list.get(i-1));
		}
	}

}
