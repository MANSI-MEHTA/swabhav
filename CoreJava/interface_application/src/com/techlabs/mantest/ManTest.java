package com.techlabs.mantest;


public class ManTest {
	public static void main(String args[]) {
		System.out.println("boy");
		playGround(new Boy());
		System.out.println("infants ");
		playGround(new Infants());

	}
	static void playGround(Man man) {
		man.read();
		man.walk();
		man.play();
		//man.eat();
		System.out.println("\n");

	}


}
