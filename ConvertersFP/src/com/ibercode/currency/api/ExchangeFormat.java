package com.ibercode.currency.api;

public interface ExchangeFormat {

	double toEuro(Double value);
	
	double toDoller(Double value);
}
