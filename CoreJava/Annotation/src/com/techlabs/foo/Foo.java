package com.techlabs.foo;

public class Foo {
	@ProTest
	public Boolean a() {
		return true;
	}

	@ProTest
	public Boolean b() {
		return true;
	}

	@ProTest
	public Boolean c() {
		return false;
	}

	@ProTest
	public Boolean d() {
		return true;
	}

}
