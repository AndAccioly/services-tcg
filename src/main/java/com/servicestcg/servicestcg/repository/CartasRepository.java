package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicestcg.servicestcg.entity.Carta;

@Repository
public interface CartasRepository extends JpaRepository<Carta, Long>{
	Carta findById(long id);

}
