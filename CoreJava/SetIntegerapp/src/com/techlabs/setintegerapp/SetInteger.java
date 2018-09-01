package com.techlabs.setintegerapp;

import java.util.*;

public class SetInteger {
	public static void main(String[] args) {
		CHashSet hs = new CHashSet();
		CTreeSet ts = new CTreeSet();
		CLinkedHashSet lhs = new CLinkedHashSet();

		System.out.println("The integers in the hashSet after are:");
		HashSet<Integer> hashset = hs.addInteger(1);
		hashset = hs.addInteger(6);
		hashset = hs.addInteger(3);
		hashset = hs.addInteger(6);
		hashset = hs.addInteger(10);
		hashset = hs.addInteger(5);
		System.out.println(hashset);

		System.out.println("\nThe integers in the treeSet after addition are:");
		TreeSet<Integer> treeset = ts.addInteger(5);
		treeset = ts.addInteger(1);
		treeset = ts.addInteger(10);
		treeset = ts.addInteger(3);
		System.out.println(treeset);

		System.out.println("\nThe integers in the linkedhashSet after addition are:");
		LinkedHashSet<Integer> linkedhashset = lhs.addInteger(8);
		linkedhashset = lhs.addInteger(4);
		linkedhashset = lhs.addInteger(1);
		linkedhashset = lhs.addInteger(10);
		System.out.println(linkedhashset);
		
		
		System.out.println("\nThe integers in the hashSet after deletion are:");
		hashset=hs.removeInteger(3);
		System.out.println(hashset);

		System.out.println("\nThe integers in the treeSet after deletion are:");
		treeset=ts.removeInteger(3);
		System.out.println(treeset);

		System.out.println("\nThe integers in the linkedhashSet after deletion are:");
		linkedhashset=lhs.removeInteger(1);
		System.out.println(linkedhashset);
		
		System.out.println("\ncheck specific integer in the hashSet is present or not :");
		if(hs.searchInteger(5))
			System.out.println("present");
		else 
			System.out.println("Not present");
			

		System.out.println("\ncheck specific integers in the treeSet is present or not:");
		if(ts.searchInteger(5))
			System.out.println("present");
		else 
			System.out.println("Not present");
			

		System.out.println("\ncheck specific integers in the linkedhashSet is present or not:");
		if(lhs.searchInteger(5))
			System.out.println("present");
		else 
			System.out.println("Not present");
			
		System.out.println("\nThe integers in the hashSet after updation are:");
		hashset=hs.updateInteger(6,12);
		System.out.println(hashset);

		System.out.println("\nThe integers in the treeSet after updation are:");
		treeset=ts.updateInteger(1,11);
		System.out.println(treeset);

		System.out.println("\nThe integers in the linkedhashSet after updation are:");
		linkedhashset=lhs.updateInteger(8,20);
		System.out.println(linkedhashset);
		
		

	}
}
