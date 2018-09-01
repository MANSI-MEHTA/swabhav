package com.techlabs.dogdoor;

public class DogDoorSimulator {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rowlff"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));

		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Bruce Starts barking.");

		recognizer.recognize(new Bark("rowlf"));
		System.out.println("\nBruce has gone outside");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		System.out.println("\nBruce's all done");

		System.out.println("but Bruce is stuck outside");
		Bark smalldogBark = new Bark("yip");
		System.out.println("Smalldog Starts barking.");
		recognizer.recognize(smalldogBark);
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		System.out.println("Bruce starts barking.... ");
		recognizer.recognize(new Bark("roowlf"));

		System.out.println("\nBruce is  back inside");
	}

}
