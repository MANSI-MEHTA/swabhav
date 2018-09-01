package com.techlabs.setintegerapp;

import java.util.*;

public class CLinkedHashSet {
	private LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();

	public LinkedHashSet<Integer> addInteger(int a) {
		h.add(a);
		return h;

	}
	public LinkedHashSet<Integer> removeInteger(int a) {
		h.remove(a);
		return h;

	}
	public Boolean searchInteger(int a) {
		if(h.contains(a))
			return true;
		else 
			return false;
		
		
	}
	public LinkedHashSet<Integer> updateInteger(int value, int updatevalue) {
		if (h.contains(value)) {
			h.remove(value);
			h.add(updatevalue);

		}
		return h;

	}

}
