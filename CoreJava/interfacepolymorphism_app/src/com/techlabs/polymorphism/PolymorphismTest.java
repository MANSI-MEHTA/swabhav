package com.techlabs.polymorphism;

public class PolymorphismTest {
	public static void main(String args[]) {
		PolymorphismTest poly = new PolymorphismTest();
		poly.atTheMovies(new Boy());
		// poly.atTheMovies(new Man());
		poly.atTheParty(new Boy());
		poly.atTheParty(new Man());

	}

	public void atTheMovies(Iemotional obj) {
		obj.cry();
		obj.laugh();
	}

	public void atTheParty(Imanable obj) {
		obj.wish();
		obj.desire();

	}

}
