package com.cspinformatique.broadleaf.client.model;

public class BlcSkuBundleItem {
	private Long id;
	private Integer quantity;
	private BlcMoney salePrice;
	private BlcMoney retailPrice;
	private Long bundleId;
	private BlcSku sku;
	private String name;
	private Boolean active;
	private String description;
	private String longDescription;
	private Long productId;

	public BlcSkuBundleItem(){
		
	}

	public BlcSkuBundleItem(Long id, Integer quantity, BlcMoney salePrice,
			BlcMoney retailPrice, Long bundleId, BlcSku sku, String name,
			Boolean active, String description, String longDescription,
			Long productId) {
		this.id = id;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.retailPrice = retailPrice;
		this.bundleId = bundleId;
		this.sku = sku;
		this.name = name;
		this.active = active;
		this.description = description;
		this.longDescription = longDescription;
		this.productId = productId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BlcMoney getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BlcMoney salePrice) {
		this.salePrice = salePrice;
	}

	public BlcMoney getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BlcMoney retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Long getBundleId() {
		return bundleId;
	}

	public void setBundleId(Long bundleId) {
		this.bundleId = bundleId;
	}

	public BlcSku getSku() {
		return sku;
	}

	public void setSku(BlcSku sku) {
		this.sku = sku;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
