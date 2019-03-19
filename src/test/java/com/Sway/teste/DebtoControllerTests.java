package com.Sway.teste;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.Sway.controller.DebtoController;
import com.Sway.model.Debto;
import com.Sway.service.DebtoService;
import com.example.demo.DemoMongoDbApplicationTests;

public class DebtoControllerTests extends DemoMongoDbApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private DebtoController debtoController;

	@Autowired
	private DebtoService debtoService;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(debtoController).build();
	}

	@Test
	public void testGETDebtoController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/debtos/1"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGETDetalheDebto() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/debtos/1"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testPOSTDebtoController() throws Exception {
		String json = "{\"codigousuario\":1,\"descricao\":\"Compras\",\"valor\":20000,\"data\":\"2019-02-08T19:50:00\"}";
		this.mockMvc.perform(MockMvcRequestBuilders.post("/api/debtos")
				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}

	@Test
	public void testPUTAddressController() throws Exception {
		String json = "{\"codigousuario\":1,\"descricao\":\"Compras\",\"valor\":20000,\"data\":\"2019-02-08T19:50:00\"}";
		Debto debto = new Debto("5c5bcc6c0000000000000000", "Compras", 20000, new Date());
		debtoService.create(debto);
		this.mockMvc.perform(MockMvcRequestBuilders.put("/api/debtos").contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(json))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}
}
