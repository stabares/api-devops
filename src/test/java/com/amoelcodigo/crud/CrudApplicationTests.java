package com.amoelcodigo.crud;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc

class CrudApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnHttpCode200OnGet() throws Exception {
		this.mockMvc.perform(get("https://api-devops.herokuapp.com/torre/detalleTorre/5")).andDo(print()).andExpect(status().isOk());

	}
	@Test
	public void assertion() throws Exception {
		this.mockMvc.perform(get("https://api-devops.herokuapp.com/torre/detalleTorre/5"))
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json("{'idTorre':5,'nombreTorre':'Torre Colpatria','cantidadAptos':1}"));
		//.andExpect(content().json("{'data':[{'idTorre':'5','nombreTorre':'Torre Colpatria','cantidadAptos':'1'}]}"));
	}
}
