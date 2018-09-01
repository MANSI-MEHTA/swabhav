package com.techlabs.mapobject;

import java.util.*;
import java.util.Map.Entry;

public class CLinkedHashMap {
	private static LinkedHashMap<Integer, Student> linkedhashmap = new LinkedHashMap<Integer, Student>();
	private static int i = 0;

	public LinkedHashMap<Integer, Student> addStudent(Student student) {
		linkedhashmap.put(++i, student);

		return linkedhashmap;

	}

	public LinkedHashMap<Integer, Student> deleteStudent(int key) {
		linkedhashmap.remove(key);

		return linkedhashmap;

	}

	public Boolean searchStudent(Student student) {

		if (linkedhashmap.containsValue(student))
			return true;
		else
			return false;
	}
	public LinkedHashMap<Integer, Student> updateStudent(int key,Student oldvalue,Student newvalue) {
		linkedhashmap.replace(key, oldvalue, newvalue);

		return linkedhashmap;

	}
	public LinkedHashMap<Integer, Student> updateStudent(int key, int oldvalue, int newvalue) {
		for (Entry<Integer, Student> entry : linkedhashmap.entrySet()) {
			if (entry.getKey() == key) {
				Student student = linkedhashmap.get(key);
				student.setAge(newvalue);
				linkedhashmap.put(key, student);

			}
		}

		return linkedhashmap;

	}


}
