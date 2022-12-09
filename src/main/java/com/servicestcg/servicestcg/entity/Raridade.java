package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001RARIDADE")
public class Raridade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	
	private String nome;
	private String sigla;
	private long jogo;
	
	public Raridade() {
		this.id = 0;
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

	public long getJogo() {
		return jogo;
	}

	public void setJogo(long jogo) {
		this.jogo = jogo;
	}

	public long getId() {
		return id;
	}
	
	
	
	
}
