package com.techlabs.tictactoc.test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.tictactoc.Cell;
import com.techlabs.tictactoc.GameStatus;
import com.techlabs.tictactoc.NineTileBoard;
import com.techlabs.tictactoc.ResultAnalyser;

class ResultAnalyserTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	NineTileBoard board = new NineTileBoard();
	ResultAnalyser resultAnalyser = new ResultAnalyser(board);
	HashMap<Integer, Cell> listOfMark = null;

	@Test
	void shouldFirstColoumnofXMarksReturnTrueInCheckVerticallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(4);
		NineTileBoard.setSwitch(2);

		board.setCell(1);
		NineTileBoard.setSwitch(4);
		board.setCell(7);

		listOfMark = board.getBoard();

		boolean xWon = resultAnalyser.checkVertically(listOfMark, 1);
		assertEquals(true, xWon);

	}

	@Test
	void shouldSecondColoumnofXMarksReturnTrueInCheckVerticallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(8);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(2);

		listOfMark = board.getBoard();

		boolean xWon = resultAnalyser.checkVertically(listOfMark, 2);
		assertEquals(true, xWon);

	}

	@Test
	void shouldThirdColoumnofXMarksReturnTrueInCheckVerticallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(6);
		NineTileBoard.setSwitch(2);

		board.setCell(9);
		NineTileBoard.setSwitch(4);
		board.setCell(3);

		listOfMark = board.getBoard();

		boolean xWon = resultAnalyser.checkVertically(listOfMark, 3);
		assertEquals(true, xWon);

	}

	@Test
	void shouldCheckStatusMethodReturnFullWhenBoardIsFull() throws Exception {
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
	void shouldCheckStatusReturnsProgressIfFirstColumnContainsEmptyCell() throws Exception {
		board.setCell(1);
		board.setCell(2);

		board.setCell(4);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfSecondColumnContainsEmptyCell() throws Exception {
		board.setCell(2);
		board.setCell(1);

		board.setCell(5);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfThirdColumnContainsEmptyCell() throws Exception {
		board.setCell(3);
		board.setCell(2);

		board.setCell(6);
		board.setCell(1);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfFirstColumnContainsBothXAndNaught() throws Exception {
		board.setCell(1);
		board.setCell(4);

		board.setCell(7);
		board.setCell(3);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfSecondColumnContainsBothXAndNaught() throws Exception {
		board.setCell(2);
		board.setCell(5);

		board.setCell(7);
		board.setCell(6);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfThirdColumnContainsBothXAndNaught() throws Exception {
		board.setCell(3);
		board.setCell(6);

		board.setCell(9);
		board.setCell(1);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfFirstRowContainsEmptyCell() throws Exception {
		board.setCell(1);
		board.setCell(4);

		board.setCell(2);
		board.setCell(5);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfSecondRowContainsEmptyCell() throws Exception {
		board.setCell(4);
		board.setCell(2);

		board.setCell(5);
		board.setCell(1);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfThirdRowContainsEmptyCell() throws Exception {
		board.setCell(7);
		board.setCell(2);

		board.setCell(8);
		board.setCell(1);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfFirstRowContainsBothXAndNaught() throws Exception {
		board.setCell(1);
		board.setCell(4);

		board.setCell(2);
		board.setCell(3);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfSecondRowContainsBothXAndNaught() throws Exception {
		board.setCell(4);
		board.setCell(1);

		board.setCell(5);
		board.setCell(6);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnsProgressIfThirdRowContainsBothXAndNaught() throws Exception {
		board.setCell(7);
		board.setCell(8);

		board.setCell(9);
		board.setCell(1);

		GameStatus progress = resultAnalyser.checkStatus();
		assertEquals(GameStatus.PROGRESS, progress);

	}

	@Test
	void shouldCheckStatusReturnXWonIFFirstRowContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);
		board.setCell(1);

		NineTileBoard.setSwitch(2);
		board.setCell(2);

		NineTileBoard.setSwitch(4);
		board.setCell(3);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldCheckStatusReturnXWonIFSecondRowContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(4);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(6);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldCheckStatusReturnXWonIFFirstColumnContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);
		board.setCell(1);

		NineTileBoard.setSwitch(2);
		board.setCell(4);

		NineTileBoard.setSwitch(4);
		board.setCell(7);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldCheckStatusReturnXWonIFSecondColumnContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(2);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(8);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldCheckStatusReturnXWonIFThirdCoumnContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(3);
		NineTileBoard.setSwitch(2);

		board.setCell(6);
		NineTileBoard.setSwitch(4);
		board.setCell(9);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldCheckStatusReturnXWonIFThirdRowContainsXMarks() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(7);
		NineTileBoard.setSwitch(2);

		board.setCell(8);
		NineTileBoard.setSwitch(4);
		board.setCell(9);

		GameStatus xWon = resultAnalyser.checkStatus();
		assertEquals(GameStatus.X_WON, xWon);

	}

	@Test
	void shouldFirstRowofXMarksReturnTrueInCheckHorizontallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(4);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(6);

		listOfMark = board.getBoard();
		boolean xWon = resultAnalyser.checkHorizontally(listOfMark, 4);
		assertEquals(true, xWon);

	}

	@Test
	void shouldSecondRowofXMarksReturnTrueInCheckHorizontallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(4);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(6);

		listOfMark = board.getBoard();
		boolean xWon = resultAnalyser.checkHorizontally(listOfMark, 4);
		assertEquals(true, xWon);

	}

	@Test
	void shouldThirdRowofXMarksReturnTrueInCheckHorizontallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(7);
		NineTileBoard.setSwitch(2);

		board.setCell(8);
		NineTileBoard.setSwitch(4);
		board.setCell(9);
		listOfMark = board.getBoard();

		boolean xWon = resultAnalyser.checkHorizontally(listOfMark, 7);
		assertEquals(true, xWon);
	}

	@Test
	void shouldCrossWonVariableBeFalseInitally() {
		boolean xWon = resultAnalyser.isoWon();
		assertEquals(false, xWon);

	}

	@Test
	void shouldNaughtWonVariableBeFalseInitally() {
		boolean oWon = resultAnalyser.isoWon();
		assertEquals(false, oWon);

	}

	@Test
	void shouldXMarksDiagonallyReturnTrueInCheckDiagonallyMethod() throws Exception {
		NineTileBoard.setSwitch(0);

		board.setCell(1);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(9);

		listOfMark = board.getBoard();
		boolean xWon = resultAnalyser.checkDiagonally(listOfMark, 1);
		assertEquals(true, xWon);

	}

	@Test
	void shouldXMarksDiagonallyReturnTrueInCheckFirstDiagonallyMethod() throws Exception {

		NineTileBoard.setSwitch(0);

		board.setCell(1);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(9);

		listOfMark = board.getBoard();
		Class<? extends ResultAnalyser> cls = resultAnalyser.getClass();
		Method method = cls.getDeclaredMethod("checkFirstDiagonal", HashMap.class, int.class, Cell.class);
		listOfMark = board.getBoard();
		method.setAccessible(true);
		boolean xWon = (boolean) method.invoke(resultAnalyser, listOfMark, 1, listOfMark.get(1));

		assertEquals(true, xWon);

	}

	@Test
	void shouldXMarksDiagonallyReturnTrueInCheckSecondDiagonallyMethod() throws Exception {

		NineTileBoard.setSwitch(0);

		board.setCell(3);
		NineTileBoard.setSwitch(2);

		board.setCell(5);
		NineTileBoard.setSwitch(4);
		board.setCell(7);

		listOfMark = board.getBoard();
		Class<? extends ResultAnalyser> cls = resultAnalyser.getClass();
		Method method = cls.getDeclaredMethod("checkFirstDiagonal", HashMap.class, int.class, Cell.class);
		listOfMark = board.getBoard();
		method.setAccessible(true);
		boolean xWon = (boolean) method.invoke(resultAnalyser, listOfMark, 3, listOfMark.get(3));

		assertEquals(true, xWon);

	}

}
