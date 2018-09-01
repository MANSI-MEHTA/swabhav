package com.techlabs.rickguitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
	@SuppressWarnings("rawtypes")
	private Map properties;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public InstrumentSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);

		}
	}

	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	@SuppressWarnings("rawtypes")
	public Map getProperties() {
		return properties;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		for (@SuppressWarnings("rawtypes")
		Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
			String propertyName = (String) i.next();
			if (!(properties.get(propertyName).equals(otherSpec.getProperty(propertyName)))) {
				return false;
			}
		}
		return true;
	}

}
