package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	List<Jogo> findAll();
}