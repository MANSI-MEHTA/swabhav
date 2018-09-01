package com.techlabs.tictactoc;

import java.util.HashMap;

public interface IResultAnalyser {
	public GameStatus checkStatus();

	public boolean checkHorizontally(HashMap<Integer, Cell> board, int currentposition);

	public boolean checkVertically(HashMap<Integer, Cell> board, int currentposition);

	public boolean checkDiagonally(HashMap<Integer, Cell> board, int currentposition);

}
