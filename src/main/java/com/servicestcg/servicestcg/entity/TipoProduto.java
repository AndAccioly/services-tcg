package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001TIPO_PRODUTO")
public class TipoProduto {

	@Id
	private final long tipo_produto_id;
	
	private final String nome;
	
	public TipoProduto() {
		this.tipo_produto_id = 0;
		this.nome = "";
	}

	public long getTipo_produto_id() {
		return tipo_produto_id;
	}

	public String getNome() {
		return nome;
	}
	
	
}
