package com.techlabs.shoppingcart;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private long order_id;
	private Date date;
	private List<LineItems> orderitems = new ArrayList<LineItems>();

	public Order() throws Exception {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime todaysdate = LocalDateTime.now();
		String splitByDate[] = dtf.format(todaysdate).toString().split("/");
		String date = splitByDate[0] + splitByDate[1] + splitByDate[2];

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalDateTime currenttime = LocalDateTime.now();
		String splitByTime[] = dtf1.format(currenttime).toString().split(":");
		String time = date + splitByTime[0] + splitByTime[1] + splitByTime[2];

		this.order_id = Long.parseLong(time);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		this.date = dateFormat.parse("27/07/2018");

	}

	public List<LineItems> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<LineItems> orderitems) {
		this.orderitems = orderitems;
	}

	public void cancelOrder() {
		orderitems.removeAll(orderitems);
	}

	public double placeOrder() {
		double sum = 0;
		for (LineItems lineitem : orderitems) {
			sum = sum + lineitem.totalCostItem();
		}
		return sum;
	}

}
