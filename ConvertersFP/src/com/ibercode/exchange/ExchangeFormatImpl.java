package com.ibercode.exchange;

import com.ibercode.exchange.api.Display;
import com.ibercode.exchange.api.ExchangeFormat;

public class ExchangeFormatImpl implements ExchangeFormat{

	@Override
	public Display toEuro(Double value) {
		
		return edi -> edi.showValue(value * 0.888917, "€‚¬");
	}

	@Override
	public Display toDollar(Double value) {
		
		return edi -> edi.showValue(value * 1.12496, "$");
	}

}
