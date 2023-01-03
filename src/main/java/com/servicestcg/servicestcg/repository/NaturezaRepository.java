package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Natureza;
import com.servicestcg.servicestcg.entity.Raridade;

public interface NaturezaRepository extends JpaRepository<Natureza, Long>{
	List<Natureza> findByJogo(long id);
	Natureza findById(long id);
}
