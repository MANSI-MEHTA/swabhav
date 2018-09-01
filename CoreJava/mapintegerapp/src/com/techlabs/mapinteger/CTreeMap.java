package com.techlabs.mapinteger;

import java.util.*;

public class CTreeMap {
	TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
	public TreeMap<Integer,String> addInteger(int a[]) {
		for(int i=0;i<a.length;i++) {
			treemap.put(a[i],Integer.toString(a[i]));
			
		}
		return treemap;
		
	}
	public TreeMap<Integer, String> removeInteger(int key, String value) {
		treemap.remove(key, value);
		return treemap;

	}

	public Boolean searchInteger(String value) {
		if (treemap.containsValue(value))
			return true;
		else
			return false;

	}

	public TreeMap<Integer, String> updateInteger(int key, String oldvalue, String newvalue) {
		treemap.replace(key, oldvalue, newvalue);

		return treemap;

	}



}
