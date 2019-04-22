package com.ibercode.currency;

import com.ibercode.currency.api.ExchangeFormat;

public class ExchangeFormatImpl implements ExchangeFormat{

	@Override
	public double toEuro(Double value) {
		return value * 0.888917;
	}

	@Override
	public double toDoller(Double value) {
		return value * 1.12496;
	}

}
