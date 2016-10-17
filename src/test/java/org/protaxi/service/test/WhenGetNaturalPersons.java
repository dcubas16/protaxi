package org.protaxi.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.protaxi.business.ClientFactory;
import org.protaxi.entities.Client;
import org.protaxi.entities.NaturalPerson;
import org.protaxi.services.ClientService;
import org.protaxi.test.util.ClientMother;
import org.protaxi.test.util.TestConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WhenGetNaturalPersons extends TestConfigurator {

	@Autowired
	ClientService clientService;

	@Autowired
	@Qualifier("naturalPersonManager")
	ClientFactory naturalPersonManager;

	@Test
	public void thenShouldGetNaturalPersonById() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPerson.setId(1);
		naturalPersonManager.setClient(naturalPerson);

		NaturalPerson naturalPersonReceived = (NaturalPerson) clientService.getClientById(naturalPersonManager);

		Assert.assertNotNull(naturalPersonReceived); 	
		
	}

	@Test
	public void ifNaturalPersonDoesntExiststhenShouldReturnNull() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPerson.setId(100);
		naturalPersonManager.setClient(naturalPerson);

		NaturalPerson naturalPersonReceived = (NaturalPerson) clientService.getClientById(naturalPersonManager);

		Assert.assertNull(naturalPersonReceived); 	
		
	}
	
	@Test
	public void thenShouldReturnNaturalPersonsByManyFields() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPersonManager.setClient(naturalPerson);

		List<Client> naturalPersons = clientService.getClients(naturalPersonManager);

		Assert.assertNotNull(naturalPersons);	
	}
	
	@Test
	public void thenShouldGetNaturalPersonByEmail() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPerson.setEmail("email_00000");
		naturalPersonManager.setClient(naturalPerson);

		NaturalPerson naturalPersonReceived = (NaturalPerson) clientService.getClientByEmail(naturalPersonManager);

		Assert.assertNotNull(naturalPersonReceived); 	
		
	}
	
	@Test
	public void thenShouldGetNaturalPersonByEmailAndPassword() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPerson.setEmail("email_00000");
		naturalPerson.setPassword("password0");
		naturalPersonManager.setClient(naturalPerson);

		NaturalPerson naturalPersonReceived = (NaturalPerson) clientService.getClientByEmailAndPassword(naturalPersonManager);

		Assert.assertNotNull(naturalPersonReceived); 	
		
	}
}
