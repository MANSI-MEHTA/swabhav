package com.tectlabs.test;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) throws Exception {
		ArrayList<JobCandidate> candidate = new ArrayList<JobCandidate>();
		candidate.add(new JobCandidate("varshil", 100000, 1233, 21));
		candidate.add(new JobCandidate("shubham", 110000, 1234, 21));
		candidate.add(new JobCandidate("karan", 130000, 1236, 21));
		candidate.add(new JobCandidate("manoj", 120000, 1235, 21));

		CandidateSort cs = new CandidateSort();
		cs.getSortedListOfCandidate(candidate);

		System.out.println(" after sorting : ");
		for (JobCandidate list : candidate) {
			System.out
					.println(list.getName() + "\t " + list.getSalary() + "\t " + list.getId() + "\t " + list.getAge());
		}

	}

}
