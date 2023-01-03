package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicestcg.servicestcg.entity.Raridade;

@Repository
public interface RaridadeRepository extends JpaRepository<Raridade, Long>{
	List<Raridade> findByJogo(long jogo);
	Raridade findById(long id);
}
