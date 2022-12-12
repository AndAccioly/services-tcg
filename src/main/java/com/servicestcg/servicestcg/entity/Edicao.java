package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001EDICAO")
public class Edicao {

	@Id
	private final long edicao_id;
	
	private final String nome;
	
	private String ano;
	
	private long jogo;
	
	public Edicao() {
		this.edicao_id = 0;
		this.nome = "";
		
	}

	public Edicao(long edicao_id, String nome) {
		this.edicao_id = edicao_id;
		this.nome = nome;
	}

	public long getEdicao_id() {
		return edicao_id;
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
