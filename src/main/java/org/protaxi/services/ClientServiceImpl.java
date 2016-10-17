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
	public Client getClientById(ClientFactory clientFactory) {
		return clientFactory.getClientById();
	}

	@Override
	public List<Client> getClients(ClientFactory clientFactory) {
		return clientFactory.getClients();
	}

	@Override
	public Client getClientByEmail(ClientFactory clientFactory) {
		return clientFactory.getClientByEmail();
	}

	@Override
	public Client getClientByEmailAndPassword(ClientFactory clientFactory) {
		return clientFactory.getClientByEmailAndPassword();
	}

}
