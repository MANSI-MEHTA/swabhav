package com.techlabs.tictactoc;

public class Cell {
	Mark mark;

	public Cell(Mark mark) {
		super();
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark){
		if (this.mark == Mark.Empty)
			this.mark = mark;
		else
			throw new RuntimeException("Cell is Already mark");
	}

}
