package com.techlabs.rto;

public class RTO {
private String code;
private String state;

public RTO(String code, String state) {
	super();
	this.code = code;
	this.state = state;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
