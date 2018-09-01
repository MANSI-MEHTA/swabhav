package com.techlabs.rickguitar;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWWOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "indian_rosewood";
		case BRAZILIAN_ROSEWWOD:
			return "brazilian_rosewood";
		case MAHOGANY:
			return "mahogany";
		case MAPLE:
			return "maple";
		case COCOBOLO:
			return "cocobolo";
		case CEDAR:
			return "cedar";
		case ADIRONDACK:
			return "adirondack";
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";
		default:
			return "not Found";
		}
	}
}
