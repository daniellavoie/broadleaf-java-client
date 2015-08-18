package com.cspinformatique.broadleaf.client.model;


import java.math.BigDecimal;
import java.util.Currency;

public class BlcMoney {
	private BigDecimal amount;
	private Currency currency;
	
	public BlcMoney(){
		
	}

	public BlcMoney(BigDecimal amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
