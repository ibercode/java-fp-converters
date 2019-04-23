package com.ibercode.exchange.api;

public interface ExchangeFormat {

	Display toEuro(Double value);
	
	Display toDollar(Double value);
}
