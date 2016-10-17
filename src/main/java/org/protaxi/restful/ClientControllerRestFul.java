package org.protaxi.restful;

import org.json.JSONException;
import org.json.JSONObject;
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
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
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
		return "Hola Mundo";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String login(@RequestBody(required = true) String objetoLogin) {

		NaturalPerson naturalPerson = new NaturalPerson();
		JSONObject jsonObj;
		String jsonInString = "";
		
		try {
			jsonObj = new JSONObject(objetoLogin);
			naturalPerson.setEmail(jsonObj.getString("email"));
			naturalPerson.setPassword(jsonObj.getString("password"));
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
