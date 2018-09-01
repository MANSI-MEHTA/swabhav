package com.techlabs.shoppingcart.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Product;

class ProductTest {

	@Test
	void checkCostAfterDiscountValue() {
		Product product = new Product();
		product.setCost(100);
		product.setDiscount(10);
		int costAfterDiscount = (int) product.costAfterDiscount();
		assertEquals(90, costAfterDiscount);
	}

}
