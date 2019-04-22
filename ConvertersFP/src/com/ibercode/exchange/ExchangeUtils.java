package com.ibercode.exchange;


public class ExchangeUtils {

	public static Exchange convertToEuro(double value) {
		return ef -> ef.toEuro(value);
	}
	
	public static Exchange convertToDollar(double value) {
		return ef -> ef.toDollar(value);
	}
}
