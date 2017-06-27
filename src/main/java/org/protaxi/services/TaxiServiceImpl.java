package org.protaxi.services;

import org.protaxi.ProtaxiConstants;
import org.protaxi.dao.TaxiDAO;
import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.ResponseInformation;
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
			boolean isRequestSaved = taxiDAO.saveRequestTaxi(taxiCaller);
			
			if(!isRequestSaved)
				return false;
			
			FireBaseAccess fireBaseAccess = new FireBaseAccess();
			fireBaseAccess.configure(ProtaxiConstants.FIREBASE_DATABASE_NAME);
			
			boolean isSuccess = fireBaseAccess.requestTaxi(taxiCaller);
			
			if(isSuccess)
				return isSuccess;
			
			return false;
			
		}catch(Exception ex){
			
			System.out.println("Entra aqui" + ex.toString());
			return false;
		}
	}

	@Override
	public ResponseInformation saveRequestTaxiConfirmation(RequestTaxi requestTaxi) {
		
		try{
			ResponseInformation responseInformation = new ResponseInformation();
			
			responseInformation = taxiDAO.saveRequestTaxiConfirmation(requestTaxi);
			
			
			FireBaseAccess fireBaseAccess = new FireBaseAccess();
			fireBaseAccess.configure(ProtaxiConstants.FIREBASE_DATABASE_NAME);
			
			@SuppressWarnings("unused")
			boolean isSuccess = fireBaseAccess.requestTaxi(requestTaxi);
			
			return responseInformation;
			
		}catch(Exception ex){
			
			return new ResponseInformation(false, ex.getMessage());
		}
	}

}
