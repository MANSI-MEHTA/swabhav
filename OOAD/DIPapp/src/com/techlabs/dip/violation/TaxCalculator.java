package com.techlabs.dip.violation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaxCalculator {
	private LogType logtype;

	public TaxCalculator(LogType logtype) {

		this.logtype = logtype;

	}

	public LogType getLogtype() {
		return logtype;
	}

	public void setLogtype(LogType logtype) {
		this.logtype = logtype;
	}

	public int calulate(int amount, int rate) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date dateobj = new Date();

		try {
			int result = amount / rate;
			return result;
		} catch (Exception e) {
			if (this.logtype == LogType.WIN) {
				WinLogType object = new WinLogType();
				object.log(df.format(dateobj), "Either of the value are o");

			} else if (this.logtype == LogType.XML) {
				XmlLogType object = new XmlLogType();
				object.log(df.format(dateobj), "Either of the value are o");

			} else if (this.logtype == LogType.TXT) {
				TxtLogType object = new TxtLogType();
				object.log(df.format(dateobj), "Either of the value are o");

			}

		}
		return 0;
	}
}
