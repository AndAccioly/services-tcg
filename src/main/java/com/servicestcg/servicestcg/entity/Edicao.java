package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001EDICAO")
public class Edicao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	
	private final String nome;
	
	private String ano;
	
	private long jogo;
	
	public Edicao() {
		this.id = 0;
		this.nome = "";
		
	}

	public Edicao(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public long getJogo() {
		return jogo;
	}

	public void setJogo(long jogo) {
		this.jogo = jogo;
	}
	
	
}
