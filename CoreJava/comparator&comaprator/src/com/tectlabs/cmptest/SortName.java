package com.tectlabs.cmptest;

import java.util.Comparator;

public class SortName  implements Comparator<Cmp>{
	public int compare(Cmp cmp1,Cmp cmp2) {
		return (cmp1.getName()).compareTo(cmp2.getName());
	}
	
}
