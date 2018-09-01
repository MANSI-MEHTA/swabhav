package com.techlabs.mapinteger;

import java.util.*;

public class CLinkedHashMap {
	LinkedHashMap<Integer,String> linkedhashmap=new LinkedHashMap<Integer,String>();
	public LinkedHashMap<Integer,String> addInteger(int a[]) {
		for(int i=0;i<a.length;i++) {
			linkedhashmap.put(a[i],Integer.toString(a[i]));
			
			
		}
		return linkedhashmap;
		
	}
	public LinkedHashMap<Integer, String> removeInteger(int key, String value) {
		linkedhashmap.remove(key, value);
		return linkedhashmap;

	}

	public Boolean searchInteger(String value) {
		if (linkedhashmap.containsValue(value))
			return true;
		else
			return false;

	}

	public LinkedHashMap<Integer, String> updateInteger(int key, String oldvalue, String newvalue) {
		linkedhashmap.replace(key, oldvalue, newvalue);

		return linkedhashmap;

	}



}
