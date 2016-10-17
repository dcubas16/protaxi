package org.protaxi.services;

import java.util.List;

import org.protaxi.business.ClientFactory;
import org.protaxi.entities.Client;

public interface ClientService {
	
	public int createClient(ClientFactory clientFactory);
	public boolean updateClient(ClientFactory clientFactory);
	public boolean deleteClient(ClientFactory clientFactory);
	public List<Client> getClients(ClientFactory clientFactory);
	public Client getClientById(ClientFactory clientFactory);
	public Client getClientByEmail(ClientFactory naturalPersonManager);
	public Client getClientByEmailAndPassword(ClientFactory clientFactory);
	
}
