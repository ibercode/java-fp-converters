package com.ibercode.temperature.api;

@FunctionalInterface
public interface Temperature {

	double getValue(TemperatureFormat format);
}
