package com.ibercode.temperature;

import com.ibercode.temperature.api.Temperature;

public class TemperatureUtils {

	public static Temperature convertToCelsius(double value) {
		return temperatureFormat -> temperatureFormat.getCelsius(value);
	}
	
	public static Temperature convertToFahrenheit(double value) {
		return temperatureFormat -> temperatureFormat.getFahrenheit(value);
	}
}
