package com.cspinformatique.broadleaf.client.model;


public class BlcProductOptionValue {
	private String attributeValue;
	private BlcMoney priceAdjustement;
	private Long productOptionId;
	
	public BlcProductOptionValue(){
		
	}

	public BlcProductOptionValue(String attributeValue,
			BlcMoney priceAdjustement, Long productOptionId) {
		this.attributeValue = attributeValue;
		this.priceAdjustement = priceAdjustement;
		this.productOptionId = productOptionId;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public BlcMoney getPriceAdjustement() {
		return priceAdjustement;
	}

	public void setPriceAdjustement(BlcMoney priceAdjustement) {
		this.priceAdjustement = priceAdjustement;
	}

	public Long getProductOptionId() {
		return productOptionId;
	}

	public void setProductOptionId(Long productOptionId) {
		this.productOptionId = productOptionId;
	}
}
