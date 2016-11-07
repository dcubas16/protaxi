package org.protaxi.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.protaxi.entities.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TaxiDAOImpl implements TaxiDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveRequestTaxi(TaxiCaller taxiCaller)throws HibernateException {
		
		sessionFactory.getCurrentSession().save(taxiCaller);
		
		return (taxiCaller.getId() > 0);
	}

}
