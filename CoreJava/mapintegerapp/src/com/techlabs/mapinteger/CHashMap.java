package com.techlabs.mapinteger;

import java.util.*;

public class CHashMap {
	private HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

	public HashMap<Integer, String> addInteger(int a[]) {
		for (int i = 0; i < a.length; i++) {
			hashmap.put(a[i], Integer.toString(a[i]));

		}
		return hashmap;

	}

	public HashMap<Integer, String> removeInteger(int key, String value) {
		hashmap.remove(key, value);
		return hashmap;

	}

	public Boolean searchInteger(String value) {
		if (hashmap.containsValue(value))
			return true;
		else
			return false;

	}

	public HashMap<Integer, String> updateInteger(int key, String oldvalue, String newvalue) {
		hashmap.replace(key, oldvalue, newvalue);

		return hashmap;

	}

}
