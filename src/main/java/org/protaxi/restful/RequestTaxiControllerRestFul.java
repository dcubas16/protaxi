package org.protaxi.restful;

import org.json.JSONObject;
import org.protaxi.dto.RequestTaxiDTO;
import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.ResponseInformation;
import org.protaxi.services.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/requestTaxi")
public class RequestTaxiControllerRestFul {

	@Autowired
	TaxiService taxiService;

	ObjectMapper mapper = new ObjectMapper();

	@RequestMapping(value = "/saveRequestTaxiConfirmation", method = RequestMethod.POST, produces = "application/json")
	public String saveRequestTaxiConfirmation(@RequestParam(required = true) String requestTaxiDTO)
			throws JsonProcessingException {

		String jsonInString = "";
		
		try {
			JSONObject jsonObject = new JSONObject(requestTaxiDTO);
			ObjectMapper mapper = new ObjectMapper();
			RequestTaxiDTO requestTaxiDTOAux = mapper.readValue(jsonObject.toString(), new TypeReference<RequestTaxiDTO>() {
			});

			RequestTaxi requestTaxi = new RequestTaxi(requestTaxiDTOAux);

			ResponseInformation responseInformation = taxiService.saveRequestTaxiConfirmation(requestTaxi);

			jsonInString = mapper.writeValueAsString(responseInformation);

		} catch (Exception ex) {

			jsonInString = mapper.writeValueAsString(new ResponseInformation(false, ex.getMessage()));
		}
		
		return jsonInString;
	}

}
