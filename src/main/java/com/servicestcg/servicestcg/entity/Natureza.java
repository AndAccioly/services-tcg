package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001NATUREZA")
public class Natureza {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	
	private String nome;
	private long jogo;
	
	public Natureza() {
		this.id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
