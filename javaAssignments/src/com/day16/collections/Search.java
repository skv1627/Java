package com.day16.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("Albhabet");
			if(list.contains("Albhabet")) {
				System.out.println("Imposter is present");
			}else {
				System.out.println("No imposter");
			}
	}

}
