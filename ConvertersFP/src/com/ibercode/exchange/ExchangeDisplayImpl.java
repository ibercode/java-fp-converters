package com.ibercode.exchange;

public class ExchangeDisplayImpl implements ExchangeDisplay{

	@Override
	public void showValue(double value, String currency) {
		System.out.println("Exchange " + value + " " + currency);
	}

}
