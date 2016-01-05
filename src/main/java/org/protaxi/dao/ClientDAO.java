package org.protaxi.dao;

import org.protaxi.entities.Client;

public interface ClientDAO {

	public int createClient(Client client);

	public boolean updateClient(Client client);

	public boolean deleteClient(Client client);

}
