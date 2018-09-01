package com.tectlabs.cmptest;

import java.util.ArrayList;
import java.util.Collections;

public class CmpTest {
	public static void main(String args[]) throws Exception {
		ArrayList<Cmp> cmp = new ArrayList<Cmp>();
		cmp.add(new Cmp(1998, "a"));
		cmp.add(new Cmp(1999, "b"));
		cmp.add(new Cmp(1995, "c"));
		cmp.add(new Cmp(1996, "d"));

		Collections.sort(cmp, new SortYear());
		System.out.println(" after sorting : ");
		for (Cmp list : cmp) {
			System.out.println(list.getName()+"\t "+list.getYear());
		}

		Collections.sort(cmp, new SortName());
		System.out.println(" after sorting : ");
		for (Cmp list : cmp) {
			System.out.println(list.getName()+"\t "+list.getYear());
		}

	}
}
