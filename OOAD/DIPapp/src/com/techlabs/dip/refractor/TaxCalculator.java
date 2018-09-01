package com.techlabs.dip.refractor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaxCalculator {
	private ILogType logtype;

	public TaxCalculator(ILogType logtype) {
		super();
		this.logtype = logtype;
	}

	public int calulate(int amount, int rate) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date dateobj = new Date();
		try {
			int result = amount / rate;
			return result;
		} catch (Exception e) {
			logtype.log(df.format(dateobj), "Either of the value are o");
		}
		return 0;	
	}
}
