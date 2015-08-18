package com.cspinformatique.broadleaf.client.model;

import java.util.Date;
import java.util.List;

public class BlcProduct {
	private Long id;
	private String name;
	private String description;
	private String longDescription;
	private BlcMoney retailPrice;
	private BlcMoney salePrice;
	private BlcMedia primaryMedia;
	private Boolean active;
	private List<BlcProductOption> productOptions;
	private Integer priority;
	private BlcMoney bundleItemsRetailPrice;
	private BlcMoney bundleItemsSalePrice;
	private Date activeStartDate;
	private Date activeEndDate;
	private String manufacturer;
	private String model;
	private String promoMessage;
	private Long defaultCategoryId;
	private List<BlcRelatedProduct> upscaleProducts;
	private List<BlcRelatedProduct> crossSaleProducts;
	private List<BlcProductAttribute> productAttributes;
	private List<BlcMedia> media;
	private List<BlcSkuBundleItem> skuBundleItems;
	
	public BlcProduct(){
		
	}

	public BlcProduct(Long id, String name, String description,
			String longDescription, BlcMoney retailPrice, BlcMoney salePrice,
			BlcMedia primaryMedia, Boolean active,
			List<BlcProductOption> productOptions, Integer priority,
			BlcMoney bundleItemsRetailPrice, BlcMoney bundleItemsSalePrice,
			Date activeStartDate, Date activeEndDate, String manufacturer,
			String model, String promoMessage, Long defaultCategoryId,
			List<BlcRelatedProduct> upscaleProducts,
			List<BlcRelatedProduct> crossSaleProducts,
			List<BlcProductAttribute> productAttributes, List<BlcMedia> media,
			List<BlcSkuBundleItem> skuBundleItems) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.longDescription = longDescription;
		this.retailPrice = retailPrice;
		this.salePrice = salePrice;
		this.primaryMedia = primaryMedia;
		this.active = active;
		this.productOptions = productOptions;
		this.priority = priority;
		this.bundleItemsRetailPrice = bundleItemsRetailPrice;
		this.bundleItemsSalePrice = bundleItemsSalePrice;
		this.activeStartDate = activeStartDate;
		this.activeEndDate = activeEndDate;
		this.manufacturer = manufacturer;
		this.model = model;
		this.promoMessage = promoMessage;
		this.defaultCategoryId = defaultCategoryId;
		this.upscaleProducts = upscaleProducts;
		this.crossSaleProducts = crossSaleProducts;
		this.productAttributes = productAttributes;
		this.media = media;
		this.skuBundleItems = skuBundleItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public BlcMedia getPrimaryMedia() {
		return primaryMedia;
	}

	public void setPrimaryMedia(BlcMedia primaryMedia) {
		this.primaryMedia = primaryMedia;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<BlcProductOption> getProductOptions() {
		return productOptions;
	}

	public void setProductOptions(List<BlcProductOption> productOptions) {
		this.productOptions = productOptions;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public BlcMoney getBundleItemsRetailPrice() {
		return bundleItemsRetailPrice;
	}

	public void setBundleItemsRetailPrice(BlcMoney bundleItemsRetailPrice) {
		this.bundleItemsRetailPrice = bundleItemsRetailPrice;
	}

	public BlcMoney getBundleItemsSalePrice() {
		return bundleItemsSalePrice;
	}

	public void setBundleItemsSalePrice(BlcMoney bundleItemsSalePrice) {
		this.bundleItemsSalePrice = bundleItemsSalePrice;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPromoMessage() {
		return promoMessage;
	}

	public void setPromoMessage(String promoMessage) {
		this.promoMessage = promoMessage;
	}

	public Long getDefaultCategoryId() {
		return defaultCategoryId;
	}

	public void setDefaultCategoryId(Long defaultCategoryId) {
		this.defaultCategoryId = defaultCategoryId;
	}

	public List<BlcRelatedProduct> getUpscaleProducts() {
		return upscaleProducts;
	}

	public void setUpscaleProducts(List<BlcRelatedProduct> upscaleProducts) {
		this.upscaleProducts = upscaleProducts;
	}

	public List<BlcRelatedProduct> getCrossSaleProducts() {
		return crossSaleProducts;
	}

	public void setCrossSaleProducts(List<BlcRelatedProduct> crossSaleProducts) {
		this.crossSaleProducts = crossSaleProducts;
	}

	public List<BlcProductAttribute> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<BlcProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public List<BlcMedia> getMedia() {
		return media;
	}

	public void setMedia(List<BlcMedia> media) {
		this.media = media;
	}

	public List<BlcSkuBundleItem> getSkuBundleItems() {
		return skuBundleItems;
	}

	public void setSkuBundleItems(List<BlcSkuBundleItem> skuBundleItems) {
		this.skuBundleItems = skuBundleItems;
	}
}
