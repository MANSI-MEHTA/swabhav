package com.techlabs.setintegerapp;

import java.util.*;

public class CTreeSet {
	private TreeSet<Integer> h = new TreeSet<Integer>();

	public TreeSet<Integer> addInteger(int a) {
		h.add(a);
		return h;

	}

	public TreeSet<Integer> removeInteger(int a) {
		h.remove(a);
		return h;

	}

	public Boolean searchInteger(int a) {
		if (h.contains(a))
			return true;
		else
			return false;

	}

	public TreeSet<Integer> updateInteger(int value, int updatevalue) {
		if (h.contains(value)) {
			h.remove(value);
			h.add(updatevalue);


		}
		return h;

	}
}
