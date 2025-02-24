package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("swarna");
		list.add("kumar");
		list.add("vusa");
		System.out.println("Before Shuffling "+list);
		Collections.shuffle(list);
		System.out.println("After Shuffling "+list);
	}

}
