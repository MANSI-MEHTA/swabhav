package com.techlabs.tictactoc.test;

import java.util.HashMap;
import java.util.Scanner;

import com.techlabs.tictactoc.Cell;
import com.techlabs.tictactoc.Game;
import com.techlabs.tictactoc.GameStatus;
import com.techlabs.tictactoc.Mark;
import com.techlabs.tictactoc.NineTileBoard;
import com.techlabs.tictactoc.Player;
import com.techlabs.tictactoc.ResultAnalyser;

public class GameConsole {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NineTileBoard ninetileboard = new NineTileBoard();
		Player[] player = new Player[2];
		player[0] = new Player(Mark.X, "varshil");
		player[1] = new Player(Mark.O, "shubham");

		Game game = new Game(new ResultAnalyser(ninetileboard), ninetileboard, player);

		GameStatus result = null;
		game.init();

		do {
			System.out.println(game.getCurrentPlayer().getName() + " your chance,play");
			int location = sc.nextInt();
			result = tryCatchMethod(game, result, location);
		} while (result == GameStatus.PROGRESS);
		System.out.println(result);
		sc.close();

	}

	private static GameStatus tryCatchMethod(Game game, GameStatus result, int location) {
		try {
			result = game.play(location);
			displayProgress(game, result);
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return result;
	}

	private static void displayProgress(Game game, GameStatus result) {
		if (result == GameStatus.PROGRESS) {
			display(game.getTileBoard().getBoard());
			System.out.println("\n\n" + GameStatus.PROGRESS);
		}
	}

	public static void display(HashMap<Integer, Cell> board) {
		for (int i = 1; i <= 9; i++) {
			if (i % 3 == 1)
				System.out.println();
			if (((Cell) board.get(i)).getMark() == Mark.Empty) {
				System.out.print("-\t");
			} else
				System.out.print(((Cell) board.get(i)).getMark() + "\t");

		}
	}
}
