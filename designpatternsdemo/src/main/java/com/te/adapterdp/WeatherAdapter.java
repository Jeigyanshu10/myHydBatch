package com.te.adapterdp;

public class WeatherAdapter {

	public static String findCity(int zipCode) {

		String city = null;
		if (zipCode == 500003) {
			city = "hyd";
		} else if (zipCode == 505209) {
			city = "blr";
		} else if (zipCode == 568008) {
			city = "pune";
		}
		return city;
	}

}
