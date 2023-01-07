package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.entity.Edicao;

@Repository
public interface CartasRepository extends JpaRepository<Carta, Long>{
	Carta findById(long id);
	List<Carta> findByEdicao(Edicao edicao);

}
