package com.techlabs.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrentJunitTestTest {

	@Test
	void amountShouldNotBeGreaterThanCurrentBalancePlus10000(){
		CurrentAccount account=new CurrentAccount("varshil",5000);
		Boolean result=account.withdraw(15000);
		assertEquals(true,result);
		
	}

}
