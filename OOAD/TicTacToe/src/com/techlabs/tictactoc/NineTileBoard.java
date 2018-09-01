package com.techlabs.tictactoc;

import java.util.HashMap;

public class NineTileBoard implements IBoard {
	private HashMap<Integer, Cell> board = new HashMap<Integer, Cell>();
	public static final int type = 3;
	private static int Switch =0 ;

	public NineTileBoard() {
		for (int i = 1; i <= 9; i++) {
			board.put(i, new Cell(Mark.Empty));
		}
	}

	@Override
	public void setCell(int location) throws Exception {
		if (Switch % 2 == 0)
			board.get(location).setMark(Mark.X);
		else
			board.get(location).setMark(Mark.O);
		board.replace(location, board.get(location));
		Switch++;

	}

	@Override
	public HashMap<Integer, Cell> getBoard() {
		return board;
	}

	public void setBoard(HashMap<Integer, Cell> board) {
		this.board = board;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public GameStatus isBoardFull() {
		int k = 0;
		for (k = 1; k <= 9; k++) {
			Cell cell = (Cell) board.get(k);
			if (cell.getMark() == Mark.Empty) {
				break;
			}
		}
		if (k > 9)
			return GameStatus.Full;
		return null;

	}

	public static int getSwitch() {
		return Switch;
	}

	public static void setSwitch(int count) {
		NineTileBoard.Switch = count;
	}

}
