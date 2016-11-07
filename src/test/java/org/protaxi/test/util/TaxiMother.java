package org.protaxi.test.util;

import java.util.Date;
import org.protaxi.entities.TaxiCaller;

public class TaxiMother {

	
	public static TaxiCaller getTaxiCaller() {

		return new TaxiCaller(1, -12.0931827, -77.0247266, new Date(), "ACT");
	}
}
