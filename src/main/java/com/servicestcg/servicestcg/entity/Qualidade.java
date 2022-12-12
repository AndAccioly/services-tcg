package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "T001QUALIDADE")
public class Qualidade {
	
	@Id
	private final long qualidade_id;
	
	private String nome;
	private String sigla;
	
	public Qualidade() {
		this.qualidade_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public long getQualidade_id() {
		return qualidade_id;
	}
	
}
