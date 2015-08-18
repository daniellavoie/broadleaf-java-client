package com.cspinformatique.broadleaf.client.model;

import java.util.Date;

public class BlcSku {
	private Long id;
	private Date activeStartDate;
	private Date activeEndDate;
	private String name;
	private Boolean active;
	private String inventoryType;
	private String description;
	private BlcMoney retailPrice;
	private BlcMoney salePrice;
	private BlcWeight weight;
	private BlcDimension dimension;
	
	public BlcSku(){
		
	}

	public BlcSku(Long id, Date activeStartDate, Date activeEndDate,
			String name, Boolean active, String inventoryType,
			String description, BlcMoney retailPrice, BlcMoney salePrice,
			BlcWeight weight, BlcDimension dimension) {
		this.id = id;
		this.activeStartDate = activeStartDate;
		this.activeEndDate = activeEndDate;
		this.name = name;
		this.active = active;
		this.inventoryType = inventoryType;
		this.description = description;
		this.retailPrice = retailPrice;
		this.salePrice = salePrice;
		this.weight = weight;
		this.dimension = dimension;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Date activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public Date getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Date activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BlcMoney getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BlcMoney retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BlcMoney getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BlcMoney salePrice) {
		this.salePrice = salePrice;
	}

	public BlcWeight getWeight() {
		return weight;
	}

	public void setWeight(BlcWeight weight) {
		this.weight = weight;
	}

	public BlcDimension getDimension() {
		return dimension;
	}

	public void setDimension(BlcDimension dimension) {
		this.dimension = dimension;
	}
}
