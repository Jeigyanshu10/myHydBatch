package com.te.adapterdp;

public class WeatherReportImpl implements WeatherReport {

	@Override
	public int getTemp(String city) {
		int temp = 0;
		if (city.equalsIgnoreCase("hyd")) {
			temp = 10;
		} else if (city.equalsIgnoreCase("blr")) {
			temp = 20;
		} else if (city.equalsIgnoreCase("pune")) {
			temp = 9;
		}
		return temp;
	}
}