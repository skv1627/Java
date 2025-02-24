package com.day16.collections;

import java.util.ArrayList;

public class Extraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swarna");
		list.add("Kumar");
		list.add("Venom");
		list.add("Spyder");
	    System.out.println("Before Extraction: "+list);
	    
	    System.out.println("After Extraction: "+list.subList(1, 3));
	}

}
