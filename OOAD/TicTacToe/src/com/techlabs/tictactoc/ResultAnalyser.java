package com.techlabs.tictactoc;

import java.util.HashMap;

public class ResultAnalyser implements IResultAnalyser {
	private IBoard board;
	private GameStatus gamestatus;
	private boolean xWon = false;
	private boolean oWon = false;

	public ResultAnalyser(IBoard board) {
		super();
		this.board = board;
	}

	@Override
	public GameStatus checkStatus() {
		gamestatus = GameStatus.PROGRESS;
		HashMap<Integer, Cell> listOfCell = board.getBoard();

		if (board.isBoardFull() == GameStatus.Full)
			return GameStatus.Full;
		for (int i = 1; i <= 9; i += 3) {
			boolean result = checkHorizontally(listOfCell, i);
			checkResult(listOfCell, i, result);

		}
		if (xWon)
			return GameStatus.X_WON;
		else if (oWon)
			return GameStatus.O_WON;

		for (int i = 1; i <= 3; i++) {
			boolean result = checkVertically(listOfCell, i);
			checkResult(listOfCell, i, result);

		}
		if (xWon)
			return GameStatus.X_WON;
		else if (oWon)
			return GameStatus.O_WON;

		for (int i = 1; i <= 3; i += 2) {
			boolean result = checkDiagonally(listOfCell, i);
			checkResult(listOfCell, i, result);

		}
		if (xWon)
			return GameStatus.X_WON;
		else if (oWon)
			return GameStatus.O_WON;

		return gamestatus;

	}

	private void checkResult(HashMap<Integer, Cell> listOfCell, int i, boolean result) {
		if (result)
			checkMark(listOfCell, i);
		else
			gamestatus = GameStatus.PROGRESS;
	}

	private void checkMark(HashMap<Integer, Cell> listOfCell, int i) {
		if (listOfCell.get(i).getMark() == Mark.X)
			xWon = true;
		else
			oWon = true;
	}

	@Override
	public boolean checkHorizontally(HashMap<Integer, Cell> listOfCell, int currentposition) {

		int j = 0;
		Cell cell = listOfCell.get(currentposition);
		if (cell.getMark() == Mark.Empty)
			return false;
		for (j = currentposition; j <= (currentposition + 2); j++) {
			Cell checkingcell = listOfCell.get(j);

			if (cell.getMark() != checkingcell.getMark())
				break;

		}
		if (j > (currentposition + 2))
			return true;
		return false;

	}

	@Override
	public boolean checkVertically(HashMap<Integer, Cell> listOfCell, int currentposition) {
		int j = 0;
		Cell cell =listOfCell.get(currentposition);
		if (cell.getMark() == Mark.Empty)
			return false;

		for (j = currentposition; j <= (currentposition + 6); j += 3) {
			Cell checkingcell =listOfCell.get(j);

			if (cell.getMark() != checkingcell.getMark())
				break;

		}
		if (j > (currentposition + 6))
			return true;
		return false;
	}

	@Override
	public boolean checkDiagonally(HashMap<Integer, Cell> listOfCell, int currentposition) {
		Cell cell =listOfCell.get(currentposition);
		if (cell.getMark() == Mark.Empty)
			return false;

		if (currentposition == 1) {
			return checkFirstDiagonal(listOfCell, currentposition, cell);
		}
		return checkSecondDiagonal(listOfCell, currentposition, cell);

	}

	private boolean checkSecondDiagonal(HashMap<Integer, Cell> listOfCell, int currentposition, Cell cell) {
		int j=0;
		for (j = currentposition; j <= 7; j += 2) {
			Cell checkingcell =listOfCell.get(j);

			if (cell.getMark() != checkingcell.getMark())
				break;

		}
		if (j > 7)
			return true;
		return false;
	}

	private boolean checkFirstDiagonal(HashMap<Integer, Cell> listOfCell, int currentposition, Cell cell) {
		int j=0;
		for (j = currentposition; j <= 9; j += 4) {
			Cell checkingcell =listOfCell.get(j);
			if (cell.getMark() != checkingcell.getMark())
				break;

		}
		if (j > 9)
			return true;
		return false;
	}

	public boolean isxWon() {
		return xWon;
	}

	public void setxWon(boolean xWon) {
		this.xWon = xWon;
	}

	public boolean isoWon() {
		return oWon;
	}

	public void setoWon(boolean oWon) {
		this.oWon = oWon;
	}

}
