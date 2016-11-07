package org.protaxi.restful;

import java.util.Date;
import org.protaxi.business.ClientFactory;
import org.protaxi.dto.NaturalPersonDTO;
import org.protaxi.entities.Client;
import org.protaxi.entities.NaturalPerson;
import org.protaxi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/client")
public class ClientControllerRestFul {

	@Autowired
	ClientService clientService;

	@Autowired
	@Qualifier("naturalPersonManager")
	ClientFactory naturalPersonManager;
	
	ObjectMapper mapper = new ObjectMapper();

	@RequestMapping(value = "/createNaturalPerson", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String createNaturalPerson(@RequestBody(required = true) NaturalPersonDTO naturalPersonDTO) {

		NaturalPerson naturalPerson = new NaturalPerson();
		
		naturalPersonManager.setClient(naturalPerson.getNaturalPerson(naturalPersonDTO));

		int uuid = clientService.createClient(naturalPersonManager);

		return Integer.toString(uuid);
	}
	
	@RequestMapping(value = "/callTest", method = RequestMethod.GET, produces = "application/json")
	public String callTest() {
		System.out.println(new Date() + " -- CallTest");
		return "{\"hola\":\"Hola Mundo\"}";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password) {

		NaturalPerson naturalPerson = new NaturalPerson();
		String jsonInString = "";
		
		try {
			System.out.println(new Date() + " -- Login");

			naturalPerson.setEmail(email);
			naturalPerson.setPassword(password);
			naturalPersonManager.setClient(naturalPerson);
			
			Client client = clientService.getClientByEmailAndPassword(naturalPersonManager);

			jsonInString = mapper.writeValueAsString(client);
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
				
		return jsonInString;
	}
}
