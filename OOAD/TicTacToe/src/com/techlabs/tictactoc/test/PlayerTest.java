package com.techlabs.tictactoc.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoc.Mark;
import com.techlabs.tictactoc.Player;

class PlayerTest {

	@Test
	void checkWeGetPlayerName() {
		Player player = new Player(Mark.X, "Varshil");
		String name = player.getName();
		assertEquals("Varshil", name);

	}

	@Test
	void checkWeGetPlayerMark() {
		Player player = new Player(Mark.X, "Varshil");
		Mark playerMark = player.getMark();
		assertEquals(Mark.X, playerMark);

	}

}
