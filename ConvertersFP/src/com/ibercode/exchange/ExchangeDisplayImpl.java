package com.ibercode.exchange;

import com.ibercode.exchange.api.ExchangeDisplay;

public class ExchangeDisplayImpl implements ExchangeDisplay{

	@Override
	public void showValue(double value, String currency) {
		System.out.println("Exchange " + value + " " + currency);
	}

}
