package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private static int playerId;
	static {
		playerId = 100;
	}
	Player(String name, int age) {
		playerId++;
		this.age = age;
		this.name = name;
		

	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public int getPlayerId() {
		return playerId;

	}

}
