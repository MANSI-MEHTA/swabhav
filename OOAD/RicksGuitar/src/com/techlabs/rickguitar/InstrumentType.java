package com.techlabs.rickguitar;

public enum InstrumentType {
	GUITAR, BANJO, DOBRA, FIDDLE, BASS, MANDOLIN;
	public String toString() {
		switch (this) {
		case GUITAR:
			return "Guitar";
		case BANJO:
			return "Banjo";
		case DOBRA:
			return "Dobra";
		case FIDDLE:
			return "Fiddle";
		case BASS:
			return "Bass";
		case MANDOLIN:
			return "Mandolin";
		default:
			return "Not Found";
		}
	}

}
