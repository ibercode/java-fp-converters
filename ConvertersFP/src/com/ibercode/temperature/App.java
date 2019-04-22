package com.ibercode.temperature;

public class App {

	public static void main(String[] args) {
		
		double celsius = TemperatureUtils
							.convertToCelsius(110)
							.getValue(new TemperatureFormatImpl());
		
		double fahrenheit = TemperatureUtils
								.convertToFahrenheit(23)
								.getValue(new TemperatureFormatImpl());
		
		System.out.println(String.format("Temp: %.2f ºC", celsius));
		System.out.println(String.format("Temp: %.2f ºF", fahrenheit));
	}
}
