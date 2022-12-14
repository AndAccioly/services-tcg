package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);
	Cliente findByUsername(String username);
}
