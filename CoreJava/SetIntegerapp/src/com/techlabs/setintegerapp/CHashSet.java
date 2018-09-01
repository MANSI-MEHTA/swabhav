package com.techlabs.setintegerapp;

import java.util.*;

public class CHashSet {
	HashSet<Integer> h = new HashSet<Integer>();

	public HashSet<Integer> addInteger(int a) {
		h.add(a);
		return h;

	}

	public HashSet<Integer> removeInteger(int a) {
		h.remove(a);
		return h;

	}
	public Boolean searchInteger(int a) {
		if(h.contains(a))
			return true;
		else 
			return false;
		
		
	}
	public HashSet<Integer> updateInteger(int value, int updatevalue) {
		if (h.contains(value)) {
			h.remove(value);
			h.add(updatevalue);


		}
		return h;

	}
}
