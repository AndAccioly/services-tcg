package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001TIPO_PRODUTO")
public class TipoProduto {

	@Id
	private final long tipo_produto_id;
	
	private final String nome;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProduto", fetch = FetchType.LAZY)
	private List<Produto> produtos;
	
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
