package com.tectlabs.cmptest;

import java.util.Comparator;

public class SortYear  implements Comparator<Cmp>{
	public int compare(Cmp cmp1,Cmp cmp2) {
		return cmp1.getYear() - cmp2.getYear();
	}
}
