package com.techlabs.mapobject;

import java.util.HashMap;
import java.util.Map.Entry;

public class CHashMap {
	private static HashMap<Integer, Student> hashmap = new HashMap<Integer, Student>();
	private static int i = 0;

	public HashMap<Integer, Student> addStudent(Student student) {
		hashmap.put(++i, student);

		return hashmap;

	}

	public HashMap<Integer, Student> deleteStudent(int key) {
		hashmap.remove(key);

		return hashmap;

	}

	public Boolean searchStudent(Student student) {

		if (hashmap.containsValue(student))
			return true;
		else
			return false;
	}

	public HashMap<Integer, Student> updateStudent(int key, int oldvalue, int newvalue) {
		for (Entry<Integer, Student> entry : hashmap.entrySet()) {
			if (entry.getKey() == key) {
				Student student = hashmap.get(key);
				student.setAge(newvalue);
				hashmap.put(key, student);

			}
		}

		return hashmap;

	}

}
