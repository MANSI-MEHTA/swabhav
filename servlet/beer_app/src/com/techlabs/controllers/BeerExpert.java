package com.techlabs.controllers;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List getBrands(String color) {
		List brand = new ArrayList();
		if (color.equals("amber")) {
			brand.add("jack amber");
			brand.add("Red Moose");

		}
		else{
			brand.add("Jail pale Ale");
			brand.add("Gout Stout");
			
		}
		return brand;
	}
}
