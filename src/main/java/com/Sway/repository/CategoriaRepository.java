package com.Sway.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Sway.model.Categorias;

@Repository
public interface CategoriaRepository extends MongoRepository<Categorias, String>{
	
	@Query("{ 'categoria': {$regex: ?0, $options: 'i'} }")
	public List<Categorias> findCategoriasSugeridas(String categoria);

}
