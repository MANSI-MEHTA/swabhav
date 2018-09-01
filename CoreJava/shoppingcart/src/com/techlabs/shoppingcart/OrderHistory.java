package com.techlabs.shoppingcart;

import java.util.List;
import java.util.Scanner;

public class OrderHistory {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer("varshil", "ncdhbfcuefbchebchuefbc");
		int choice;
		do {
			System.out.println("Select anyone option");
			System.out.println("1.Add To cart");
			System.out.println("2.Delete any lineitem");
			System.out.println("3.place your order");
			System.out.println("4.Cancel your order");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Product product = new Product("laptop", 551, 100, 10);
				LineItems lineitem = new LineItems(14845, 5, product);
				customer.addToCart(lineitem);

				Product product2 = new Product("mobile", 55, 1000, 10);
				LineItems lineitem2 = new LineItems(1484, 5, product2);
				customer.addToCart(lineitem2);

				break;
			case 2:
				customer.removeFromcart(1484);
				break;
			case 3:
				display(customer.getOrder().getOrderitems());
				System.out.println("Total cost is " + customer.getOrder().placeOrder());
				break;
			case 4:
				customer.getOrder().cancelOrder();
				break;

			}

		} while (choice != 4);
		sc.close();

	}

	public static void display(List<LineItems> lineitems) {
		for (LineItems lineitem : lineitems) {
			System.out.println("product name =" + lineitem.getProduct().getProduct_name() + "\tQuantity "
					+ lineitem.getQuantity() + "\tCostAfterDiscount " + lineitem.totalCostItem());
		}

	}
}
