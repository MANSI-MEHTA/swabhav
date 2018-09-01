package com.techlabs.rto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class Database {
	private String filename;

	public Database(String filename) {
		this.filename = filename;
	}

	@SuppressWarnings("null")
	public ArrayList<RTO> readFromProperty() throws Exception {
		ArrayList<RTO> rto1 = new ArrayList<RTO>();
		File f = new File(filename);
		if (f.exists()) {
			FileInputStream fin = new FileInputStream(filename);
			Properties p = new Properties();
			p.load(fin);
			Set<String> keys = p.stringPropertyNames();
			for (String key : keys) {
				rto1.add(new RTO(key, p.getProperty(key)));
			}
			fin.close();

		}

		return rto1;
	}

	public void writeInToProperty(ArrayList<RTO> rtos) throws Exception {
		File f = new File(filename);
		if (f.exists()) {
			FileOutputStream fop = new FileOutputStream(filename);
			Properties p = new Properties();
			for (RTO rto : rtos) {
				p.setProperty(rto.getCode(), rto.getState());
			}
			p.store(fop, null);
			fop.close();
		}

	}
}
