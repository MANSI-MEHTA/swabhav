package com.techlabs.rickguitar;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	@SuppressWarnings("rawtypes")
	private List inventory;

	@SuppressWarnings("rawtypes")
	public Inventory() {
		this.inventory = new LinkedList();
	}

	@SuppressWarnings("unchecked")
	public void addinstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = null;
		instrument = new Instrument(serialNumber, price, spec);
         
		inventory.add(instrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (@SuppressWarnings("rawtypes")
		Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}

		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(InstrumentSpec searchSpec) {
		List matchingInstrumemnts = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingInstrumemnts.add(instrument);
		}
		return matchingInstrumemnts;

	}

}
