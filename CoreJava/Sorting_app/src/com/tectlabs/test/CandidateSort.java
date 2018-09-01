package com.tectlabs.test;

import java.util.ArrayList;
import java.util.Collections;

public class CandidateSort {
	/*
	 * public void getSortedListOfCandidate(ArrayList<JobCandidate> candidate){
	 * Collections.sort(candidate);
	 * 
	 * }
	 */
	public void getSortedListOfCandidate(ArrayList<JobCandidate> candidate) {
		Collections.sort(candidate, new SortByName());

	}
}
