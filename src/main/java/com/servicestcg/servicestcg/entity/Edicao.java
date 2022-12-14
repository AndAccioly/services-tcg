package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001EDICAO")
public class Edicao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long edicao_id;
	
	private final String nome;
	private String ano;
	private long jogo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "edicao", fetch = FetchType.LAZY)
	private List<Carta> cartas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "edicao", fetch = FetchType.LAZY)
	private List<Produto> produtos;
	
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
