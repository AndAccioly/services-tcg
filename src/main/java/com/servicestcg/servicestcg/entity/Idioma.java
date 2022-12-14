package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001IDIOMA")
public class Idioma {

	@Id
	private final long idioma_id;
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idioma", fetch = FetchType.LAZY)
	private List<Carta> cartas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idioma", fetch = FetchType.LAZY)
	private List<Produto> produtos;

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

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
}
