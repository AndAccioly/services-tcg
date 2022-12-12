package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "T001JOGO")
public class Jogo {

	@Id
	private final long jogo_id;
	
	private String nome;
	
	public Jogo() {
		this.jogo_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getJogo_id() {
		return jogo_id;
	}


}
