package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001NATUREZA")
public class Natureza {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long natureza_id;
	
	private String nome;
	private long jogo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "natureza", fetch = FetchType.LAZY)
	private List<Carta> cartas;
	
	public Natureza() {
		this.natureza_id = 0;
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

	public long getNatureza_id() {
		return natureza_id;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	

}
