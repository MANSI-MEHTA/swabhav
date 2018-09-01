package com.techlabs.mapinteger;

import java.util.*;

public class MapInteger {
	public static void main(String[] args) {
		CHashMap hm = new CHashMap();
		CTreeMap tm = new CTreeMap();
		CLinkedHashMap lhm = new CLinkedHashMap();
		int a[] = new int[] { 6, 14, 1, 5, 2, 7, 20, 5, 2, 20 };

		System.out.println("The integers in the hashMap are:");
		HashMap<Integer,String> hashmap = hm.addInteger(a);
		System.out.println(hashmap);

		
		System.out.println("\nThe integers in the treemap are:");
		TreeMap<Integer,String> treemap = tm.addInteger(a);
		System.out.println(treemap);

		System.out.println("\nThe integers in the linkedhashmap are:");
		LinkedHashMap<Integer,String> linkedhashmap = lhm.addInteger(a);
		System.out.println(linkedhashmap);
		System.out.println("\nThe integers in the hashmap after deletion are:");
		hashmap=hm.removeInteger(5,"5");
		System.out.println(hashmap);

		System.out.println("\nThe integers in the treemap after deletion are:");
		treemap=tm.removeInteger(6,"6");
		System.out.println(treemap);

		System.out.println("\nThe integers in the linkedhashSet after deletion are:");
		linkedhashmap=lhm.removeInteger(1,"1");
		System.out.println(linkedhashmap);
		
		System.out.println("\ncheck specific integer in the hashSet is present or not :");
		if(hm.searchInteger("6"))
			System.out.println("present");
		else 
			System.out.println("Not present");
			

		System.out.println("\ncheck specific integers in the treeSet is present or not:");
		if(tm.searchInteger("5"))
			System.out.println("present");
		else 
			System.out.println("Not present");
			

		System.out.println("\ncheck specific integers in the linkedhashSet is present or not:");
		if(lhm.searchInteger("5"))
			System.out.println("present");
		else 
			System.out.println("Not present");
			
		System.out.println("\nThe integers in the hashSet after updation are:");
		hashmap=hm.updateInteger(20,"20","120");
		System.out.println(hashmap);

		System.out.println("\nThe integers in the treeSet after updation are:");
		treemap=tm.updateInteger(20,"20","110");
		System.out.println(treemap);

		System.out.println("\nThe integers in the linkedhashSet after updation are:");
		linkedhashmap=lhm.updateInteger(20,"20","200");
		System.out.println(linkedhashmap);
		
		



	}

}
