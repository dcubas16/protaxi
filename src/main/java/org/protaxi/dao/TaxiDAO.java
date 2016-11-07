package org.protaxi.dao;

import org.protaxi.entities.TaxiCaller;

public interface TaxiDAO {

	boolean saveRequestTaxi(TaxiCaller taxiCaller);

}
