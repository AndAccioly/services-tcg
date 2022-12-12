package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001IDIOMA")
public class Idioma {

	@Id
	private final long idioma_id;
	private String nome;

	public Idioma() {
		this.idioma_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getIdioma_id() {
		return idioma_id;
	}

	
}
