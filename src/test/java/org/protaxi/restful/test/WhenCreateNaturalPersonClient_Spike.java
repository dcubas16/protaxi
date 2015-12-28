package org.protaxi.restful.test;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.protaxi.dto.NaturalPersonDTO;
import org.protaxi.test.util.IntegrationTestConfigurator;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.protaxi.test.util.IntegrationTestUtil;

public class WhenCreateNaturalPersonClient_Spike extends IntegrationTestConfigurator {

	@Resource
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void thenShouldSaveNaturalPerson() throws Exception {
		System.out.println("Hola mundo");

//		mockMvc.perform( post("/createNaturalPerson").contentType(IntegrationTestUtil.APPLICATION_JSON_UTF8).body(IntegrationTestUtil.convertObjectToJsonBytes(new NaturalPersonDTO()));
		// .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		// .andExpect(jsonPath("$.street").value("1"));

		// System.out.println("Hola mundo1:
		// "+mockMvc.perform(get("/createNaturalPerson")).toString());
	}
}
