package com.ibercode.exchange;


public class ExchangeFormatImpl implements ExchangeFormat{

	@Override
	public Display toEuro(Double value) {
		
		return edi -> edi.showValue(value * 0.888917, "€");
	}

	@Override
	public Display toDollar(Double value) {
		
		return edi -> edi.showValue(value * 1.12496, "$");
	}

}
