package com.techlabs.tictactoc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.tictactoc.Game;
import com.techlabs.tictactoc.Mark;
import com.techlabs.tictactoc.NineTileBoard;
import com.techlabs.tictactoc.Player;
import com.techlabs.tictactoc.ResultAnalyser;

class GameTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	NineTileBoard ninetileboard = new NineTileBoard();
	
	@Test
	void shouldNotLocationGreaterThan9AndLessThan1() {
		Game game = new Game(null, null, null);

		String message = null;
		try {
			game.play(12);
		} catch (Exception ex) {
			message = ex.getMessage();
		}
		Assert.assertEquals("Location is beyond the 1-9", message);

	}

	@Test
	void shouldPlayerSwitchFromPlayer1ToPlayer2() {
		Player[] player = new Player[2];
		player[0] = new Player(Mark.X, "varshil");
		player[1] = new Player(Mark.O, "shubham");
		Game game = null;

		game = new Game(new ResultAnalyser(ninetileboard), ninetileboard, player);

		game.switchPlayer();
		String newplayer = game.getCurrentPlayer().getName();
		assertEquals("shubham", newplayer);

	}

	@Test
	void shouldPlayerSwitchFromPlayer2ToPlayer1() {
		Player[] player = new Player[2];
		player[0] = new Player(Mark.X, "varshil");
		player[1] = new Player(Mark.O, "shubham");
		Game game = null;

		game = new Game(new ResultAnalyser(ninetileboard), ninetileboard, player);

		game.switchPlayer();
		game.switchPlayer();

		String newplayer = game.getCurrentPlayer().getName();
		assertEquals("varshil", newplayer);

	}

	@Test
	void shouldDefaultPlayerBePlayer1() {
		Player[] player = new Player[2];
		player[0] = new Player(Mark.X, "varshil");
		player[1] = new Player(Mark.O, "shubham");
		Game game = null;

		game = new Game(new ResultAnalyser(ninetileboard), ninetileboard, player);
		game.init();
		String newplayer = game.getCurrentPlayer().getName();
		assertEquals("varshil", newplayer);

	}

}
