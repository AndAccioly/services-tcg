package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.TipoLista;

public interface TipoListaRepository extends JpaRepository<TipoLista, Long>{
	TipoLista findById(long id);
}
