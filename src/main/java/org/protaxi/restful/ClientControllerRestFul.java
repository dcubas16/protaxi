package org.protaxi.restful;

import org.protaxi.business.ClientFactory;
import org.protaxi.services.ClientService;
import org.protaxi.test.util.ClientMother;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControllerRestFul  {

	@Autowired
	ClientService clientService;

	@Autowired
	@Qualifier("naturalPersonManager")
	ClientFactory naturalPersonManager;

	@RequestMapping(value = "/createNaturalPerson", method = RequestMethod.GET, produces = "application/json")
	public int createNaturalPerson() {

		naturalPersonManager.setClient(ClientMother.getNaturalPersonClient());

		int uuid = clientService.createClient(naturalPersonManager);
		
		return uuid;

	}

}
