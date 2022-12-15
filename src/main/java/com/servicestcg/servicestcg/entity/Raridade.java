package com.servicestcg.servicestcg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001RARIDADE")
public class Raridade {

	@Id
	private final long raridade_id;
	
	private String nome;
	private String sigla;
	private long jogo;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "raridade", fetch = FetchType.LAZY)
	private List<Carta> cartas;
	
	public Raridade() {
		this.raridade_id = 0;
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

	public long getRaridade_id() {
		return raridade_id;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
}
