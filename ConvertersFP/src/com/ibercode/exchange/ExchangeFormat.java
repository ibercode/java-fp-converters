package com.ibercode.exchange;

public interface ExchangeFormat {

	Display toEuro(Double value);
	
	Display toDollar(Double value);
}
