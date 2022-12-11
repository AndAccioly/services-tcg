package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Endereco;

public interface EnderecoRepository  extends JpaRepository<Endereco, Long>{
	Endereco findById(long id);

}
