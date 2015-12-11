package org.protaxi.business;

import org.protaxi.entities.Client;

public interface ClientFactory {

	
	public int createClient(Client client);
	public boolean updateClient(Client client);
	public boolean deleteClient(Client client);

}
