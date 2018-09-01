package com.techlabs.shoppingcart.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.LineItems;
import com.techlabs.shoppingcart.Product;

class LineItemsTest {

	@Test
	void checkTotalCostofEachLineItem() {
		Product product=new Product("laptop", 2, 25, 5);
		LineItems lineitem = new LineItems(25, 5, product);
		double cost = lineitem.totalCostItem();
		assertEquals(118.75, cost);

	}

}
