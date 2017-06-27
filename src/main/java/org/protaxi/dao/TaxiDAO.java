package org.protaxi.dao;

import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.ResponseInformation;
import org.protaxi.entities.TaxiCaller;

public interface TaxiDAO {

	boolean saveRequestTaxi(TaxiCaller taxiCaller);
	ResponseInformation saveRequestTaxiConfirmation(RequestTaxi requestTaxi);

}
