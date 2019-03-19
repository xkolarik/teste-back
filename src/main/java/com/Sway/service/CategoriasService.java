package com.Sway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sway.model.Categorias;
import com.Sway.repository.CategoriaRepository;

@Service
public class CategoriasService {
	
	@Autowired
	private CategoriaRepository repositorio;

	public List<Categorias> listaCategoriasSugeridas(String categoria){
		List<Categorias> categorias = repositorio.findCategoriasSugeridas(categoria);
		return categorias;
		
	}
	
}
