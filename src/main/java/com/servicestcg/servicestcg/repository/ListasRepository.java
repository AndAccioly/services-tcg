package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Listas;

public interface ListasRepository extends JpaRepository<Listas, Long>{
	Listas findById(long id);
}