package org.protaxi.services;

import org.protaxi.business.ClientFactory;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Override
	public int createClient(ClientFactory clientFactory) {
		return clientFactory.createClient();
	}

}
