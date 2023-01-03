package com.servicestcg.servicestcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Cliente;
import com.servicestcg.servicestcg.entity.Listas;

public interface ListasRepository extends JpaRepository<Listas, Long>{
	Listas findById(long id);
	List<Listas> findByCliente(Cliente cliente);
}