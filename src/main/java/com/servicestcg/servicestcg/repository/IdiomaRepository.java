package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Idioma;
import com.servicestcg.servicestcg.entity.Raridade;

public interface IdiomaRepository extends JpaRepository<Idioma, Long>{
	List<Idioma> findAll();
	Idioma findById(long id);
}