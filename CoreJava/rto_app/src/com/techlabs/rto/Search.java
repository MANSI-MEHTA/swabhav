package com.techlabs.rto;

import java.util.ArrayList;

public class Search {
	public void searchIt(ArrayList<RTO> rtos, char c) {
		for (RTO rto : rtos) {
			for (int i = 0; i < rto.getState().length(); i++) {
				if (rto.getState().charAt(i) == c) {
					System.out.println(rto.getState());
					break;
				}
			}
		}

	}
}
