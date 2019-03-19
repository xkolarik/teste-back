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
public class Debto {
	
	@Id
	private int id;
	private String descrica;
	private Double valor;
	private Data date;
	
	public Debto(int id, String descrica, Double valor, Data date) {
		super();
		this.id = id;
		this.descrica = descrica;
		this.valor = valor;
		this.date = date;
	}

	public Debto() {
	}
}
