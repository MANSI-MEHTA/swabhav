package com.techlabs.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SavingJunitTest {

	@Test
	void amountShouldNotBeGreaterThanCurrentBalanceAndMinimumBalanceShouldBe4000() {
		SavingAccount account=new SavingAccount("varshil",5000);
		Boolean result=account.withdraw(1000);
		assertEquals(true,result);
		
	}

}
