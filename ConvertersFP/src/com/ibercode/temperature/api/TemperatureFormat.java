package com.ibercode.temperature.api;

public interface TemperatureFormat {

	double getCelsius(double value);
	
	double getFahrenheit(double value);
}
