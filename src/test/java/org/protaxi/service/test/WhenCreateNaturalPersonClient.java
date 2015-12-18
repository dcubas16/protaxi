package org.protaxi.service.test;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.protaxi.business.NaturalPersonManager;
import org.protaxi.services.ClientService;
import org.protaxi.test.util.ClientMother;
import org.protaxi.test.util.TestConfigurator;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenCreateNaturalPersonClient extends TestConfigurator {

	@Autowired
	ClientService clientService;
	
	@Test
	public void thenShouldCreateNaturalPersonClient(){
		
		int uuid = clientService.createClient(new NaturalPersonManager(ClientMother.getNaturalPersonClient()));
		
		assertNotNull(uuid);
	}
	
}
