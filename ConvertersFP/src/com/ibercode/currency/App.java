package com.ibercode.currency;


public class App {

	private static double value = 100;
	
	public static void main(String[] args) {
		
		double euros = ExchangeUtils.convertToEuro(value)
										.exchange(new ExchangeFormatImpl());
		
		double dollars = ExchangeUtils.convertToDoller(value)
										.exchange(new ExchangeFormatImpl());
		
		System.out.println(String.format("%.2f$ = %.2f€",value, euros));
		System.out.println(String.format("%.2f€ = %.2f$",value, dollars));
	}
}
