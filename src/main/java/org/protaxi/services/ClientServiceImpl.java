package org.protaxi.services;

import java.util.List;

import org.protaxi.business.ClientFactory;
import org.protaxi.entities.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Override
	public int createClient(ClientFactory clientFactory) {
		return clientFactory.createClient();
	}

	@Override
	public boolean updateClient(ClientFactory clientFactory) {
		return clientFactory.updateClient();
	}

	@Override
	public boolean deleteClient(ClientFactory clientFactory) {
		return clientFactory.deleteClient();
	}
	
	@Override
	public Client getClient(ClientFactory clientFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getClients(ClientFactory clientFactory) {
		// TODO Auto-generated method stub
		return null;
	}

}
