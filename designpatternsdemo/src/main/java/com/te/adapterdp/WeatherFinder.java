package com.te.adapterdp;

public class WeatherFinder {

	public static int findWeather(int zipCode) {
		WeatherReport wr = new WeatherReportImpl();
		String city = WeatherAdapter.findCity(zipCode);
		int temperature = wr.getTemp(city);
		return temperature;
	}

}
