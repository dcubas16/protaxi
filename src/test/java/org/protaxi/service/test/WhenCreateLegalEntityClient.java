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

public class WhenCreateLegalEntityClient extends TestConfigurator {

	@Autowired
	ClientService clientService;
	
	@Autowired
	@Qualifier("legalEntityManager")
	ClientFactory legalEntityManager;
	
	@Test
	public void thenShouldCreateLegalEntityClient(){
		
		legalEntityManager.setClient(ClientMother.getLegalEntityClient());
		
		int uuid = clientService.createClient(legalEntityManager);
		
		assertNotNull(uuid);
	}
	
	@Test(expected = PropertyValueException.class)
	public void ifRequieredLegalEntityFieldsAreNotCompleteThenShouldReturnException(){
		
		legalEntityManager.setClient(ClientMother.getIncompleteLegalEntityClient());
		
		clientService.createClient(legalEntityManager);

	}
	
}
