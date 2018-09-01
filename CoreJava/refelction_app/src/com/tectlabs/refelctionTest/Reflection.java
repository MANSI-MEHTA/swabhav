package com.tectlabs.refelctionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {

	public Constructor[] getNumberOfTheConstructor(Class cls) {
		return cls.getDeclaredConstructors();
	}

	public Method[] getNumberOfTheMethods(Class cls) {
		return cls.getDeclaredMethods();

	}

	public int getNumberOfTheGetSetMethods(Class cls) throws Exception{
		Method[] methods = cls.getDeclaredMethods();
		int count=0;
		for (int i=0;i<methods.length;i++) {
			if (methods[i].getName().startsWith("get") || methods[i].getName().startsWith("set")) {
				count++;
				
			}
			
		}
		return count;
	}
}
