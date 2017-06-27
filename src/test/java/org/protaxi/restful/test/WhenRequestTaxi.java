package org.protaxi.restful.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.protaxi.test.util.IntegrationTestConfigurator;
import org.protaxi.test.util.TaxiMother;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WhenRequestTaxi extends IntegrationTestConfigurator {

	@Resource
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	ObjectMapper mapper = new ObjectMapper();


	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void thenShouldSaveRequestTaxiConfirmation() throws Exception {
		System.out.println(mapper.writeValueAsString(TaxiMother.getRequestTaxiDto()));
		mockMvc.perform(post("/requestTaxi/saveRequestTaxiConfirmation").contentType(APPLICATION_JSON_UTF8)
				.content(mapper.writeValueAsString(TaxiMother.getRequestTaxiDto())))
				.andExpect(status().isOk());
	}

}
