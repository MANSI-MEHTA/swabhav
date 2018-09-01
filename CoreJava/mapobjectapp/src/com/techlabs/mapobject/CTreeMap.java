package com.techlabs.mapobject;

import java.util.*;
import java.util.Map.Entry;

public class CTreeMap {
	private static TreeMap<Integer, Student> treemap = new TreeMap<Integer, Student>();
	private static int i = 0;

	public TreeMap<Integer, Student> addStudent(Student student) {
		treemap.put(++i, student);

		return treemap;

	}

	public TreeMap<Integer, Student> deleteStudent(int key) {
		treemap.remove(key);

		return treemap;

	}

	public Boolean searchStudent(Student student) {

		if (treemap.containsValue(student))
			return true;
		else
			return false;
	}

	public TreeMap<Integer, Student> updateStudent(int key, Student oldvalue, Student newvalue) {
		treemap.replace(key, oldvalue, newvalue);

		return treemap;

	}

	public TreeMap<Integer, Student> updateStudent(int key, int oldvalue, int newvalue) {
		for (Entry<Integer, Student> entry : treemap.entrySet()) {
			if (entry.getKey() == key) {
				Student student = treemap.get(key);
				student.setAge(newvalue);
				treemap.put(key, student);

			}
		}

		return treemap;

	}

}
