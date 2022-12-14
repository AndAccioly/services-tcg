package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001TIPO_CUPOM")
public class TipoCupom {
	
	@Id
	private final long tipo_cupom_id;
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo_cupom", fetch = FetchType.LAZY)
	private List<Cupom> tipo_cupom;
	
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
