package com.techlabs.tictactoc;

import java.util.HashMap;

public interface IBoard {
	public static final int type = 0;

	public void setCell(int location) throws Exception;

	public HashMap<Integer, Cell> getBoard();

	public GameStatus isBoardFull();

	public int getType();

}
