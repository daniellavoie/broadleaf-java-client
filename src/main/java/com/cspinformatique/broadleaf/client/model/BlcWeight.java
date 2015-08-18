package com.cspinformatique.broadleaf.client.model;


import java.math.BigDecimal;

public class BlcWeight {
	private BigDecimal weight;
	private String weightUnitOfMeasure;
	
	public BlcWeight(){
		
	}

	public BlcWeight(BigDecimal weight, String weightUnitOfMeasure) {
		this.weight = weight;
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWeightUnitOfMeasure() {
		return weightUnitOfMeasure;
	}

	public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}
}
