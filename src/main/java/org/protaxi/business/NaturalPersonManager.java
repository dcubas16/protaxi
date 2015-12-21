package org.protaxi.business;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteClient() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClient(Client client) {
		this.client = client;
		
	}

}
