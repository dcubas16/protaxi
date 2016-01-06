package org.protaxi.business;

import java.util.List;

import org.protaxi.dao.ClientDAO;
import org.protaxi.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NaturalPersonManager implements ClientFactory {
	
	@Autowired
	@Qualifier("clientDAOImpl")
	private ClientDAO clientDAO;
	
	private Client client;
	
	public NaturalPersonManager() {}
	
	public NaturalPersonManager(Client client) {
		this.client = client;
	}
	
	@Override
	public int createClient() {
		return clientDAO.createClient(this.client);
	}

	@Override
	public boolean updateClient() {
		return clientDAO.updateClient(this.client);
	}

	@Override
	public boolean deleteClient() {
		return clientDAO.deleteClient(this.client);
	}

	@Override
	public void setClient(Client client) {
		this.client = client;
		
	}

	@Override
	public Client getClientById() {
		return clientDAO.getClientById(this.client.getId());
	}

	@Override
	public List<Client> getClients() {
		return clientDAO.getClients(this.client);
	}

}
