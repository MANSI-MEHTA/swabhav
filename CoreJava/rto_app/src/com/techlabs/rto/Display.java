package com.techlabs.rto;

import java.util.ArrayList;

public class Display {
	public void displayAll(ArrayList<RTO> rtos) {
		for(RTO rto:rtos) {
			System.out.println("\t"+rto.getCode()+"\t\t"+rto.getState());
		}
		
		
	}
}
