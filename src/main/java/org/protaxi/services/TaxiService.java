package org.protaxi.services;

import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.ResponseInformation;
import org.protaxi.entities.TaxiCaller;


public interface TaxiService {

	boolean requestTaxi(TaxiCaller taxiCaller);
	ResponseInformation saveRequestTaxiConfirmation(RequestTaxi requestTaxi);

}
