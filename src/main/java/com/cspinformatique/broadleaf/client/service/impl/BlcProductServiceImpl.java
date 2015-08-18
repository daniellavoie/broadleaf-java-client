package com.cspinformatique.broadleaf.client.service.impl;

import org.springframework.http.HttpMethod;

import com.cspinformatique.broadleaf.client.BroadleafTemplate;
import com.cspinformatique.broadleaf.client.model.BlcProduct;
import com.cspinformatique.broadleaf.client.service.BlcProductService;

public class BlcProductServiceImpl extends BlcAbstractService implements
		BlcProductService {
	public BlcProductServiceImpl(BroadleafTemplate broadleafTemplate) {
		super(broadleafTemplate);
	}

	public BlcProduct findOne(long id) {
		return broadleafTemplate.exchange("catalog/product/" + id,
				HttpMethod.GET, null, BlcProduct.class);
	}

	@Override
	public BlcProduct newProduct() {
		return broadleafTemplate.exchange("catalog/product?new", HttpMethod.GET,
				null, BlcProduct.class);
	}

	@Override
	public BlcProduct save(BlcProduct product) {
		return broadleafTemplate.exchange("/catalog/product", HttpMethod.POST,
				product, BlcProduct.class);
	}

}
