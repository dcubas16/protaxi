package org.protaxi.service.test;

import org.junit.Test;
import org.protaxi.services.TaxiService;
import org.protaxi.test.util.TaxiMother;
import org.protaxi.test.util.TestConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class WhenRequesTaxi extends TestConfigurator {

	@Autowired
	TaxiService taxiService;
		
	@Test
	public void thenShouldRequestTaxi(){ 
	
		boolean isRequestSuccefull= taxiService.requestTaxi(TaxiMother.getTaxiCaller());
		
		Assert.isTrue(isRequestSuccefull);
	}
	
}
