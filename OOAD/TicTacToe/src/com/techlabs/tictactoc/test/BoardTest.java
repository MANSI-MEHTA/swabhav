package com.techlabs.tictactoc.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.tictactoc.Cell;
import com.techlabs.tictactoc.GameStatus;
import com.techlabs.tictactoc.IBoard;
import com.techlabs.tictactoc.Mark;
import com.techlabs.tictactoc.NineTileBoard;

class BoardTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	NineTileBoard board = new NineTileBoard();
	HashMap<Integer, Cell> listOfMark=null;
	@Test
	void shouldSetCellMethodChangeMarkToCrossAtEvenLocation() throws Exception {

		NineTileBoard.setSwitch(2);
		board.setCell(4);
		 listOfMark = board.getBoard();
		Mark newMark = listOfMark.get(4).getMark();
		assertEquals(Mark.X, newMark);

	}

	@Test

	void shouldSetCellMethodChangeMarkToNaughtAtOddLocation() throws Exception {

		NineTileBoard.setSwitch(1);

		board.setCell(4);
		listOfMark = board.getBoard();
		Mark newMark = listOfMark.get(4).getMark();
		assertEquals(Mark.O, newMark);

	}

	@Test
	void shouldNotSetCellByCrossIfAlreadySet() {

		String message = null;
		try {
			board.setCell(4);
			board.setCell(4);

		} catch (Exception ex) {
			message = ex.getMessage();
		}
		Assert.assertEquals("Cell is Already mark", message);

	}

	@Test
	void shouldNotSetCellByNaughtIfAlreadySet() {

		String message = null;
		try {
			board.setCell(4);
			board.setCell(4);

		} catch (Exception ex) {
			message = ex.getMessage();
		}
		Assert.assertEquals("Cell is Already mark", message);

	}

	@Test
	void isHashMapValuesAtAllLocationInitializedToEmpty() {
		 listOfMark = board.getBoard();
		Mark initalMark = listOfMark.get(1).getMark();
		assertEquals(Mark.Empty, initalMark);

	}

	@Test
	void isTypeVariableValue3() {
		NineTileBoard nineTileBoard = new NineTileBoard();

		IBoard board = nineTileBoard;
		int typeValue = board.getType();
		assertEquals(3, typeValue);

	}

	@Test
	void isBoardFullWhenAllCellsAreSet() throws Exception {
		board.setCell(1);
		board.setCell(2);
		board.setCell(3);
		board.setCell(4);
		board.setCell(5);
		board.setCell(6);
		board.setCell(7);
		board.setCell(8);
		board.setCell(9);

		GameStatus full = board.isBoardFull();
		assertEquals(GameStatus.Full, full);

	}

	@Test
	void shouldCellBeSetIfNotSet() throws Exception {

		NineTileBoard.setSwitch(2);
		board.setCell(4);
		HashMap<Integer, Cell> listOfMark = board.getBoard();
		Mark newMark = listOfMark.get(4).getMark();
		assertEquals(Mark.X, newMark);

	}

}
