package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001TIPO_CUPOM")
public class TipoCupom {
	
	@Id
	private final long tipo_cupom_id;
	private String nome;
	
	public TipoCupom() {
		this.tipo_cupom_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTipo_cupom_id() {
		return tipo_cupom_id;
	}
	
	
}
