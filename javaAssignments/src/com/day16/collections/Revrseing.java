package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Revrseing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Before Reversing the List: "+list);
		Collections.reverse(list);
		System.out.println("After Reversing the List: "+list);
	}

}
