package org.protaxi.business;

import java.util.List;

import org.protaxi.entities.Client;


public interface ClientFactory {

	
	public int createClient();
	public boolean updateClient();
	public boolean deleteClient();
	public void setClient(Client client);
	public Client getClientById();
	public List<Client> getClients();
	public Client getClientByEmail();
	public Client getClientByEmailAndPassword();

}
