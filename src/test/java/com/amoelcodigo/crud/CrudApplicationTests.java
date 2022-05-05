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
		this.mockMvc.perform(get("http://localhost:8080/torre/detalleTorre/62745499e0ac3a2050c84ecb")).andDo(print()).andExpect(status().isOk());

	}
	@Test
	public void assertion() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/torre/detalleTorre/62745499e0ac3a2050c84ecb"))
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json("{'idTorre':'62745499e0ac3a2050c84ecb','nombreTorre':'Torre Colpatria','cantidadAptos':10}"));
	}
}
