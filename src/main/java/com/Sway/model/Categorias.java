package com.Sway.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Data;
import lombok.ToString;

@Document
@Data
@ToString
@JsonPOJOBuilder
public class Categorias {
	
	@Id
	private int id;
	private String categoria;
	
	public Categorias(int id, String categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
	}
	
	
}
