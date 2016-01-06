package org.protaxi.restful;

import org.protaxi.business.ClientFactory;
import org.protaxi.dto.NaturalPersonDTO;
import org.protaxi.entities.NaturalPerson;
import org.protaxi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientControllerRestFul {

	@Autowired
	ClientService clientService;

	@Autowired
	@Qualifier("naturalPersonManager")
	ClientFactory naturalPersonManager;

	@RequestMapping(value = "/createNaturalPerson", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String createNaturalPerson(@RequestBody(required = true) NaturalPersonDTO naturalPersonDTO) {

		NaturalPerson naturalPerson = new NaturalPerson();
		
		naturalPersonManager.setClient(naturalPerson.getNaturalPerson(naturalPersonDTO));

		int uuid = clientService.createClient(naturalPersonManager);

		return Integer.toString(uuid);

	}

}
