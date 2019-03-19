package com.Sway.teste;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.Sway.controller.CategoriasController;
import com.example.demo.DemoMongoDbApplicationTests;

public class CategoriasControllerTests extends DemoMongoDbApplicationTests{
	
	private MockMvc mockMvc;

	@Autowired
	private CategoriasController categoriasController;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(categoriasController).build();
	}
	
	@Test
	public void testGETCategoriasController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/categorias/*"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
