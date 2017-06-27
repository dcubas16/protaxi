package org.protaxi.test.util;

import java.util.Date;

import org.protaxi.dto.RequestTaxiDTO;
import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.TaxiCaller;

public class TaxiMother { 

	
	public static TaxiCaller getTaxiCaller() {

		return new TaxiCaller(1, -11.990834, -77.079639, "CERCA A LA CHOZA NAUTICA", -11.989951, -77.064780, "12345678-9ABC-DEFG-HIJK-LMNOPQRSTUVW", "12345678-9ABC-DEFG-HIJK-LMNOPQRSTUVW" , "12345678-9ABC-DEFG-HIJK-LMNOPQRSTUVW",  new Date(), "ACT");
	}

	public static RequestTaxi getRequestTaxi() {
		return new RequestTaxi(1, 1, -11.990834, -77.079639, "jiron los castanos", "1553", "cerca a la choza nautica", -11.989951, -77.064780, "cerca a palmeras", "123", "123", (new Date()) );
	}
	
	public static RequestTaxiDTO getRequestTaxiDto() {
		return new RequestTaxiDTO(1, 1, -11.990834, -77.079639, "jiron los castanos", "1553", "cerca a la choza nautica", -11.989951, -77.064780, "cerca a palmeras", "123", "123", (new Date()) );
	}
}
