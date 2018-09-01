package com.techlabs.bank;

@SuppressWarnings("serial")
public class ManagerCantBeStoredException extends RuntimeException {
	public ManagerCantBeStoredException(String s){
		super(s);
	}
}
