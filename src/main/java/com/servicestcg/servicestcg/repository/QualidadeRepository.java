package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Edicao;
import com.servicestcg.servicestcg.entity.Qualidade;

public interface QualidadeRepository extends JpaRepository<Qualidade, Long>{
	List<Qualidade> findAll();
	Qualidade findById(long id);
}