package org.protaxi.services;

import org.protaxi.dao.TaxiDAO;
import org.protaxi.entities.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TaxiServiceImpl implements TaxiService {

	@Autowired
	@Qualifier("taxiDAOImpl")
	private TaxiDAO taxiDAO;
	
	@Override
	public boolean requestTaxi(TaxiCaller taxiCaller) {
		try{
			
			taxiDAO.saveRequestTaxi(taxiCaller);
			
			return true;
			
		}catch(Exception ex){
			return false;
		}
	}

}
