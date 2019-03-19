package com.Sway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sway.model.Categorias;
import com.Sway.service.CategoriasService;

@RestController
@RequestMapping("/api1")
public class CategoriasController {
	
	@Autowired
	private CategoriasService categoriasService;
	
	@RequestMapping(value = "/categorias/{categoria}", produces="application/json", method = RequestMethod.GET)
	public ResponseEntity<List<Categorias>> getCategoria(@RequestParam String categoria){
		List<Categorias> categorias = categoriasService.listaCategoriasSugeridas(categoria);
		return new ResponseEntity<>(categorias, HttpStatus.OK);
	}
	
}
