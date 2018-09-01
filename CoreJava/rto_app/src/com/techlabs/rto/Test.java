package com.techlabs.rto;

import java.util.*;
public class Test {
	private static String filename="dbs.properties";
	
	public static void main(String args[])throws Exception {
		int i=0;
		Scanner sc=new Scanner(System.in);
		Display display=new Display();
		Search search=new Search();
		ArrayList<RTO> list=new ArrayList<RTO>();
		Database dbs=new Database(filename);
		
		list.add(new RTO ("MH","maharshtra"));
		list.add(new RTO ( "GJ","gujarat"));
		list.add(new RTO("Go","goa"));
		list.add(new RTO("UP","uttar Pradesh"));
		dbs.writeInToProperty(list);
		list=dbs.readFromProperty();
		
		do { 
			System.out.println("Select anyone option");
			System.out.println("1.Display");
			System.out.println("2.Search");
			System.out.println("3.Exit");
			i=sc.nextInt();
			switch(i) {
			case 1:display.displayAll(list);
			break;
			case 2:search.searchIt(list,'a');
			break;
			case 3:break;
			}
			
			
		}
		while(i!=3);
		sc.close();
		
	}
	
}
