package com.techlabs.tictactoc;

public class Player {
	private Mark mark;
	private String name;

	public Player(Mark mark, String name) {
		super();
		this.mark = mark;
		this.name = name;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
