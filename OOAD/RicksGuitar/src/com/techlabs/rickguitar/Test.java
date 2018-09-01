package com.techlabs.rickguitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);

		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("found");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("we have a " + spec.getProperty("instrumentType") + "with the following properties");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ":" + spec.getProperty(propertyName));

				}
				System.out.println(" You can have this " + spec.getProperty("instrumentType") + "for $ "
						+ instrument.getPrice() + "\n--");

			}
		} else {
			System.out.println("sorry");

		}
	}

	@SuppressWarnings("unchecked")
	private static void initializeInventory(Inventory inventory) {
		@SuppressWarnings("rawtypes")
		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numString", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backwood", Wood.MAPLE);
		inventory.addinstrument("441558", 58555.0, new InstrumentSpec(properties));

	}
}
