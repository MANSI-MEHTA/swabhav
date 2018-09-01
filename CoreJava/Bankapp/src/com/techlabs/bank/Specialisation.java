package com.techlabs.bank;

public enum Specialisation {
	INSURANCE, EQUITY, MUTUALFUNDS;
	public String toString() {
		switch (this) {
		case INSURANCE:
			return "Insurance";
		case EQUITY:
			return "Equity";
		case MUTUALFUNDS:
			return "MutualFunds";
		default:
			return "not found";

		}
	}
}
