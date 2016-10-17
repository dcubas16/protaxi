package org.protaxi.dao;

import java.util.List;

import org.protaxi.entities.Client;

public interface ClientDAO {

	public int createClient(Client client);
	public boolean updateClient(Client client);
	public boolean deleteClient(Client client);
	public Client getClientById(int id);
	public List<Client> getClients(Client client);
	public Client getClientByEmail(String email);
	public Client getClientByEmailAndPassword(String email, String password);
}
