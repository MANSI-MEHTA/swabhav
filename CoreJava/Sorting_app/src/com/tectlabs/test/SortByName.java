package com.tectlabs.test;

import java.util.Comparator;

public class SortByName implements Comparator<JobCandidate> {
	public int compare(JobCandidate candidate1, JobCandidate candidate2) {
		return (candidate1.getName()).compareTo(candidate2.getName());
	}

}
