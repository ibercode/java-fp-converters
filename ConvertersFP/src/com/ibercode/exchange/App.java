package com.ibercode.exchange;

public class App {

	private static double value = 100;
	
	public static void main(String[] args) {
		
		ExchangeUtils
			.convertToEuro(value)
						.exchange(new ExchangeFormatImpl())
						.display(new ExchangeDisplayImpl());
		
		ExchangeUtils
			.convertToDollar(value)
					.exchange(new ExchangeFormatImpl())
					.display(new ExchangeDisplayImpl());
	}
}
