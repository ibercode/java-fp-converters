package com.ibercode.temperature;

import com.ibercode.temperature.api.TemperatureFormat;

public class TemperatureFormatImpl implements TemperatureFormat{

	@Override
	public double getCelsius(double value) {
		return (value - 32) * 5/9;
	}

	@Override
	public double getFahrenheit(double value) {
		return value * 1.8 + 32;
	}

}
