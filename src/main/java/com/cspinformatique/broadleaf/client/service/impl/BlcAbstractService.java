package com.cspinformatique.broadleaf.client.service.impl;

import com.cspinformatique.broadleaf.client.BroadleafTemplate;

public abstract class BlcAbstractService {
	protected BroadleafTemplate broadleafTemplate;
	
	public BlcAbstractService(BroadleafTemplate broadleafTemplate){
		this.broadleafTemplate = broadleafTemplate;
	}
}
