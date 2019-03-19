package com.Sway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Sway.model.Debto;

import lombok.Data;

@Repository
public interface DebtoRepositorio extends MongoRepository<Debto, String> {
	public Debto findByid(int id);
	
	@Query("{ 'codigousuario' : ?0, 'data': {$gte: ?1, $lte: ?2} }")
	public Debto findByIdorDate(int id, Data date);
}
