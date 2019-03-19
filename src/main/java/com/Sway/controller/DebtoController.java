package com.Sway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sway.model.Debto;
import com.Sway.service.DebtoService;

import lombok.Data;

@RestController
@RequestMapping("/api")
public class DebtoController {
	
	@Autowired
	private DebtoService debtoService;
	
	@RequestMapping("/autentica")
	public ResponseEntity<List<Debto>> autentica(@RequestParam int id, @RequestParam Data date) {
		List<Debto> debto = debtoService.getAll();
		return new ResponseEntity<>(debto, HttpStatus.OK);
	}
	
	@RequestMapping("/debtos")
	public Debto getDebto(@RequestParam int id, Data date) {
		if(date == null) {
			return debtoService.getById(id);
		}
		return debtoService.findByIdorDate(id,date);
	}
	
	@RequestMapping("/getAll")
	public List<Debto> getAll(){
		return debtoService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam int id, @RequestParam String descricao, @RequestParam double valor, @RequestParam Data date ) {
		Debto d = debtoService.update(id, descricao, valor, date);
		return d.toString();
	}
}
