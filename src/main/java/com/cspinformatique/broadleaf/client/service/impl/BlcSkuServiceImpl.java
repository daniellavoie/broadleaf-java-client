package com.cspinformatique.broadleaf.client.service.impl;

import org.springframework.http.HttpMethod;

import com.cspinformatique.broadleaf.client.BroadleafTemplate;
import com.cspinformatique.broadleaf.client.model.BlcSku;
import com.cspinformatique.broadleaf.client.service.BlcSkuService;

public class BlcSkuServiceImpl extends BlcAbstractService implements
		BlcSkuService {
	
	public BlcSkuServiceImpl(BroadleafTemplate broadleafTemplate) {
		super(broadleafTemplate);
	}

	@Override
	public BlcSku newSku() {
		return broadleafTemplate.exchange("/catalog/sku?new", HttpMethod.GET, null,
				BlcSku.class);
	}
}
