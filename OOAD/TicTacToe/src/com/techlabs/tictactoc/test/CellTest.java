package com.techlabs.tictactoc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.tictactoc.Cell;
import com.techlabs.tictactoc.Mark;

class CellTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	
	@Test
	void shouldCellBeSetByCrossIfNotSet() {
		Cell cell = new Cell(Mark.Empty);
		cell.setMark(Mark.X);
		Mark newMark = cell.getMark();

		assertEquals(Mark.X, newMark);

	}

	@Test
	void shouldCellBeSetByNaughtIfNotSet() {
		Cell cell = new Cell(Mark.Empty);
		cell.setMark(Mark.O);
		Mark newMark = cell.getMark();

		assertEquals(Mark.O, newMark);

	}

	@Test
	void shouldNotSetCellByCrossIfAlreadyMark()  {
		Cell cell = new Cell(Mark.O);
		String message=null;
		try {
			cell.setMark(Mark.X);
		} catch (Exception ex) {
			 message=ex.getMessage();
		}
		 Assert.assertEquals("Cell is Already mark",message);

	}
	@Test
	void shouldNotSetCellByNaughtIfAlreadyMark()  {
		Cell cell = new Cell(Mark.X);
		String message=null;
		try {
			cell.setMark(Mark.O);
		} catch (Exception ex) {
			 message=ex.getMessage();
		}
		 Assert.assertEquals("Cell is Already mark",message);

	}
	@Test
	void shouldgetMarkCross() {
		Cell cell = new Cell(Mark.X);
		Mark newMark = cell.getMark();
		assertEquals(Mark.X, newMark);

	}

	@Test
	void shouldgetMarkNaught() {
		Cell cell = new Cell(Mark.O);
		Mark newMark = cell.getMark();
		assertEquals(Mark.O, newMark);

	}


}
