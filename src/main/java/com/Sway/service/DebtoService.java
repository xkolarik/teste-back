package com.Sway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sway.model.Debto;
import com.Sway.repository.DebtoRepositorio;

import lombok.Data;

@Service
public class DebtoService {
	
	@Autowired
	private DebtoRepositorio repositorio;
	
	//criar
	public Debto create(int id, String descricao, double valor, Data date) {
		return repositorio.save(new Debto(id, descricao, valor, date));
	}
	
	//listar os gastos
	public List<Debto> getAll(){
		return repositorio.findAll();
	}
	
	public Debto getById(int id) {
		return repositorio.findByid(id);
	}

	//operação para debto
	public Debto update(int id, String descricao, double valor, Data date) {
		Debto d = repositorio.findByid(id);
		d.setDescrica(descricao);
		d.setValor(valor);
		d.setDate(date);
		return repositorio.save(d);
	}
	
	//delete
	public void delete(int id) {
		Debto d = repositorio.findByid(id);
		repositorio.delete(d);
	}

	public Debto findByIdorDate(int id, Data date) {
		return repositorio.findByIdorDate(id, date);
	}
}
