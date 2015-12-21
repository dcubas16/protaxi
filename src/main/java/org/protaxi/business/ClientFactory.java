package org.protaxi.business;

import org.protaxi.entities.Client;


public interface ClientFactory {

	
	public int createClient();
	public boolean updateClient();
	public boolean deleteClient();
	public void setClient(Client client);

}
