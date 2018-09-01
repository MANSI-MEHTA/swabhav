package com.techlabs.tictactoc;

public class Game {
	private IResultAnalyser resultAnalyser;
	private IBoard tileBoard;
	private Player[] player = new Player[2];
	private Player currentPlayer;

	public Game(IResultAnalyser resultAnalyser, IBoard tileBoard, Player[] player) {
		super();
		this.resultAnalyser = resultAnalyser;
		this.tileBoard = tileBoard;
		this.player = player;
	}

	public void init() {
		currentPlayer = player[0];
	}

	public GameStatus play(int location) throws Exception {
		if (location > 9)
			throw new RuntimeException("Location is beyond the 1-9");
		tileBoard.setCell(location);
		switchPlayer();
		return resultAnalyser.checkStatus();

	}

	public void switchPlayer() {
		if (this.currentPlayer == player[1])
			this.currentPlayer = player[0];
		else
			this.currentPlayer = player[1];
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public IBoard getTileBoard() {
		return tileBoard;
	}

	public void setTileBoard(IBoard tileBoard) {
		this.tileBoard = tileBoard;
	}

}
