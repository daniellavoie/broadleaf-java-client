package com.cspinformatique.broadleaf.client.model;

import java.util.List;

public class BlcProductOption {
	private String attributeName;
	private String label;
	private Boolean required;
	private String productOptionType;
	private String productOptionValidationStrategyType;
	private String productOptionValidationType;
	private List<BlcProductOptionValue> allowedValues;
	private String validationString;
	
	public BlcProductOption(){
		
	}

	public BlcProductOption(String attributeName, String label,
			Boolean required, String productOptionType,
			String productOptionValidationStrategyType,
			String productOptionValidationType,
			List<BlcProductOptionValue> allowedValues, String validationString) {
		this.attributeName = attributeName;
		this.label = label;
		this.required = required;
		this.productOptionType = productOptionType;
		this.productOptionValidationStrategyType = productOptionValidationStrategyType;
		this.productOptionValidationType = productOptionValidationType;
		this.allowedValues = allowedValues;
		this.validationString = validationString;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getProductOptionType() {
		return productOptionType;
	}

	public void setProductOptionType(String productOptionType) {
		this.productOptionType = productOptionType;
	}

	public String getProductOptionValidationStrategyType() {
		return productOptionValidationStrategyType;
	}

	public void setProductOptionValidationStrategyType(
			String productOptionValidationStrategyType) {
		this.productOptionValidationStrategyType = productOptionValidationStrategyType;
	}

	public String getProductOptionValidationType() {
		return productOptionValidationType;
	}

	public void setProductOptionValidationType(String productOptionValidationType) {
		this.productOptionValidationType = productOptionValidationType;
	}

	public List<BlcProductOptionValue> getAllowedValues() {
		return allowedValues;
	}

	public void setAllowedValues(List<BlcProductOptionValue> allowedValues) {
		this.allowedValues = allowedValues;
	}

	public String getValidationString() {
		return validationString;
	}

	public void setValidationString(String validationString) {
		this.validationString = validationString;
	}
}
