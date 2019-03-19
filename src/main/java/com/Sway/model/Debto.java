package com.Sway.model;

import java.util.Date;

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
	private Categorias categotia;
	private String descrica;
	private Double valor;
	private Data date;
	
	public Debto(int id, Categorias categotia, String descrica, Double valor, Data date) {
		super();
		this.id = id;
		this.categotia = categotia;
		this.descrica = descrica;
		this.valor = valor;
		this.date = date;
	}

	public Debto(String string, String string2, int i, Date date2) {
		// TODO Auto-generated constructor stub
	}
}
