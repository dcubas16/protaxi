package org.protaxi.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.protaxi.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ClientDAOImpl  implements ClientDAO  {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int createClient(Client client) throws HibernateException {
		sessionFactory.getCurrentSession().saveOrUpdate(client);
		return client.getId();
	}

	@Override
	public boolean updateClient(Client client) throws HibernateException {
		sessionFactory.getCurrentSession().saveOrUpdate(client);
		return true;
	}

	@Override
	public boolean deleteClient(Client client) throws HibernateException  {
		sessionFactory.getCurrentSession().delete(client);
		return true;
	}

	@Override
	public Client getClientById(int id) throws HibernateException  {
		Client client = (Client) sessionFactory.getCurrentSession().get(Client.class, id);
		return client;
	}
	
	@Override
	public List<Client> getClients(Client client) throws HibernateException{
//		Query query  = sessionFactory.getCurrentSession().createQuery("from Client");
//		query.setParameter("email", naturalPerson.getEmail());
//		query.setParameter("name", naturalPerson.getName());
//		query.setParameter("lastName", naturalPerson.getLastName());
//		query.setParameter("secondLastName", naturalPerson.getSecondLastName());
		return  null;
	}

	@Override
	public Client getClientByEmail(String email) {
		Query query= sessionFactory.getCurrentSession().
		createQuery("from Client where email=:email");
		query.setParameter("email", email);
		
		Client client = (Client) query.uniqueResult();
		
		return client;
	}

	@Override
	public Client getClientByEmailAndPassword(String email, String password) {
		Query query= sessionFactory.getCurrentSession().
		createQuery("from Client where email=:email and password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		Client client = (Client) query.uniqueResult();
		
		return client;
	}


}
