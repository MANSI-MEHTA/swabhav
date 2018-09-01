package com.techlabs.player;

public class PlayerTest {
	public static void main(String []args) {
		Player player=new Player("varshil",21);
		printDetails(player);
		
		
	}
	public static void printDetails(Player player) {
		System.out.println("Player name: "+player.getName());
		System.out.println("Player age: "+player.getAge());
		System.out.println("Player : "+player.getPlayerId());
		
	}
}
