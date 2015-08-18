package com.cspinformatique.broadleaf.client.model;


import java.math.BigDecimal;

public class BlcDimension {
	private BigDecimal width;
	private BigDecimal height;
	private BigDecimal depth;
	private BigDecimal girth;
	private String size;
	private String container;
	private String dimensionUnitOfMeasure;
	
	public BlcDimension(){
		
	}

	public BlcDimension(BigDecimal width, BigDecimal height,
			BigDecimal depth, BigDecimal girth, String size, String container,
			String dimensionUnitOfMeasure) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.girth = girth;
		this.size = size;
		this.container = container;
		this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
	}

	public BigDecimal getWidth() {
		return width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getDepth() {
		return depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}

	public BigDecimal getGirth() {
		return girth;
	}

	public void setGirth(BigDecimal girth) {
		this.girth = girth;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getDimensionUnitOfMeasure() {
		return dimensionUnitOfMeasure;
	}

	public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
		this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
	}
}
