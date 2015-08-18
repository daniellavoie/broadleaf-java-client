package com.cspinformatique.broadleaf.client.service;

import com.cspinformatique.broadleaf.client.model.BlcProduct;

public interface BlcProductService {
	BlcProduct findOne(long id);
	
	BlcProduct newProduct();
	
	BlcProduct save(BlcProduct product);
}
