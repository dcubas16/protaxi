package org.protaxi.service.test;


import static org.junit.Assert.assertNotNull;

import org.hibernate.PropertyValueException;
import org.junit.Test;
import org.protaxi.business.ClientFactory;
import org.protaxi.services.ClientService;
import org.protaxi.test.util.ClientMother;
import org.protaxi.test.util.TestConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WhenCreateNaturalPersonClient extends TestConfigurator {

	@Autowired
	ClientService clientService;
	
	@Autowired
	@Qualifier("naturalPersonManager")
	ClientFactory naturalPersonManager;
	
	@Test
	public void thenShouldCreateNaturalPersonClient(){
		
		naturalPersonManager.setClient(ClientMother.getNaturalPersonClient());
		
		int uuid = clientService.createClient(naturalPersonManager);
		
		assertNotNull(uuid);
	}
	
	@Test(expected = PropertyValueException.class)
	public void ifRequieredNaturalPersonFieldsAreNotCompleteThenShouldReturnException(){
		
		naturalPersonManager.setClient(ClientMother.getIncompleteNaturalPersonClient());
		
		clientService.createClient(naturalPersonManager);

	}
	
}
