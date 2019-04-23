package com.ibercode.exchange;

import com.ibercode.exchange.api.Exchange;

public class ExchangeUtils {

	public static Exchange convertToEuro(double value) {
		return ef -> ef.toEuro(value);
	}
	
	public static Exchange convertToDollar(double value) {
		return ef -> ef.toDollar(value);
	}
}
