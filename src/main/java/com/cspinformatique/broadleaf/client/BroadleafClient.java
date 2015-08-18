package com.cspinformatique.broadleaf.client;

import org.springframework.web.client.RestTemplate;

import com.cspinformatique.broadleaf.client.service.BlcProductService;
import com.cspinformatique.broadleaf.client.service.BlcSkuService;
import com.cspinformatique.broadleaf.client.service.impl.BlcProductServiceImpl;
import com.cspinformatique.broadleaf.client.service.impl.BlcSkuServiceImpl;

public class BroadleafClient {
	private BlcProductService productService;
	private BlcSkuService skuService;

	public BroadleafClient(String url, String username, String password) {
		this(url, username, password, new RestTemplate());
	}

	public BroadleafClient(String url, String username, String password,
			RestTemplate restTemplate) {
		BroadleafTemplate broadleafTemplate = new BroadleafTemplate(url,
				username, password, restTemplate);

		productService = new BlcProductServiceImpl(broadleafTemplate);
		skuService = new BlcSkuServiceImpl(broadleafTemplate);
	}

	public BlcProductService getProductService() {
		return productService;
	}

	public BlcSkuService getSkuService() {
		return skuService;
	}
}
