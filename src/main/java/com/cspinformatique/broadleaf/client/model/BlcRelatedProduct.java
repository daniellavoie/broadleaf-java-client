package com.cspinformatique.broadleaf.client.model;

import java.math.BigDecimal;

public class BlcRelatedProduct {
	private Long id;
	private BigDecimal sequence;
	private String promotionalMessage;
	private BlcProduct product;
	
	public BlcRelatedProduct(){
		
	}

	public BlcRelatedProduct(Long id, BigDecimal sequence,
			String promotionalMessage, BlcProduct product) {
		this.id = id;
		this.sequence = sequence;
		this.promotionalMessage = promotionalMessage;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getSequence() {
		return sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

	public String getPromotionalMessage() {
		return promotionalMessage;
	}

	public void setPromotionalMessage(String promotionalMessage) {
		this.promotionalMessage = promotionalMessage;
	}

	public BlcProduct getProduct() {
		return product;
	}

	public void setProduct(BlcProduct product) {
		this.product = product;
	}
}
