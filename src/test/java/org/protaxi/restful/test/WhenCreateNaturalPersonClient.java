package org.protaxi.restful.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.server.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.protaxi.test.util.IntegrationTestConfigurator;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class WhenCreateNaturalPersonClient extends
		IntegrationTestConfigurator {

	@Resource
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
				.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void thenShouldReturnOK() throws Exception {

		mockMvc.perform(get("/client/createNaturalPerson/").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
	@Test
	public void thenShouldSaveNaturalPerson() throws Exception {

		mockMvc.perform(get("/client/createNaturalPerson/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
				.andExpect(status().isOk())
//				 .andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("1"));
//		System.out.println("Hola");
		
	}
}
