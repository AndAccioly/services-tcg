package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Edicao;

public interface EdicaoRepository extends JpaRepository<Edicao, Long>{

	List<Edicao> findByJogo(long jogo);
	Edicao findById(long id);
}
