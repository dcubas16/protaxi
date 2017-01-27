package org.protaxi.test.util;

import java.util.Date;
import org.protaxi.entities.TaxiCaller;

public class TaxiMother { 

	
	public static TaxiCaller getTaxiCaller() {

		return new TaxiCaller(1, -11.990834, -77.079639, -11.989951, -77.064780, "CERCA A LA CHOZA NAUTICA", "12345678-9ABC-DEFG-HIJK-LMNOPQRSTUVW", "12345678-9ABC-DEFG-HIJK-LMNOPQRSTUVW" , new Date(), "ACT");
	}
}
