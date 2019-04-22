package com.ibercode.currency;

import com.ibercode.currency.api.Exchange;

public class ExchangeUtils {

	public static Exchange convertToEuro(double value) {
		return ef -> ef.toEuro(value);
	}
	
	public static Exchange convertToDoller(double value) {
		return ef -> ef.toDoller(value);
	}
}
