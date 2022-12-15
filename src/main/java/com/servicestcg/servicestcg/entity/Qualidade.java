package com.servicestcg.servicestcg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity(name = "T001QUALIDADE")
public class Qualidade {
	
	@Id
	private final long qualidade_id;
	
	private String nome;
	private String sigla;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "qualidade", fetch = FetchType.LAZY)
	private List<Carta> cartas;
	
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

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
}
