package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	Pedido findById(long id);
}