package com.techlabs.rickguitar;

public enum Style {
	A, B, C, D;
	public String toString() {
		switch (this) {
		case A:
			return "a";
		case B:
			return "b";
		case C:
			return "c";
		case D:
			return "d";
		default:
			return "not found";

		}
	}
}
