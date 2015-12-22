package org.protaxi.restful.test;

import org.junit.Test;
import org.protaxi.restful.ClientControllerRestFul;
import org.protaxi.test.util.TestConfigurator;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.http.MediaType;

public class WhenCreateNaturalPersonClient extends TestConfigurator{

	private final MockMvc mockMvc = standaloneSetup(
			new ClientControllerRestFul()).build();

	@Test
	public void thenShouldSaveNaturalPerson() throws Exception {

		mockMvc.perform(get("/createNaturalPerson"))
				.andExpect(status().isOk())	
				.andExpect(
						content().contentType(MediaType.APPLICATION_JSON_VALUE)
								)
				.andExpect(jsonPath("$.street").value("1"));
	}
}
