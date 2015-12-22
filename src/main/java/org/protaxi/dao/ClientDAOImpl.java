package org.protaxi.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.protaxi.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ClientDAOImpl  implements ClientDAO  {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public int createClient(Client client) throws HibernateException {
		sessionFactory.getCurrentSession().save(client);
		return client.getId();
	}

}
