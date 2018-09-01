package com.techlabs.dogdoor;

public class DogDoorSimulator {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		System.out.println("Fido barks to go outside");

		recognizer.recognize("woof");
		System.out.println("\nFido has gone outside");
		System.out.println("\nFido's all done");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("but Fido is stuck outside");
		System.out.println("Fido starts barking.... ");
		recognizer.recognize("woof");

		System.out.println("\nFido back inside");
	}

}
