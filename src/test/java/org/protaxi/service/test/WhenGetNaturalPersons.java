package org.protaxi.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.protaxi.business.ClientFactory;
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
	public void thenShouldGetNaturalPerson() {

		NaturalPerson naturalPerson = ClientMother.getFirstNaturalPersonClient();
		naturalPersonManager.setClient(naturalPerson);

		boolean isDeleted = clientService.deleteClient(naturalPersonManager);

		Assert.assertTrue(isDeleted);
	}

}
