package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "T001CARTA")
public class Carta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long carta_id;
	
	private String nome;
	private Double valor;
	private Date data_inicio;
	private Date data_fim;
	private String descricao;
	private Integer estoque;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "edicao", nullable=false)
	private Edicao edicao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idioma", nullable=false)
	private Idioma idioma;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "natureza", nullable=false)
	private Natureza natureza;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "raridade", nullable=false)
	private Raridade raridade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "qualidade", nullable=false)
	private Qualidade qualidade;
	
	public Carta() {
		this.carta_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Edicao getEdicao() {
		return edicao;
	}

	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getCarta_id() {
		return carta_id;
	}

	public Natureza getNatureza() {
		return natureza;
	}

	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}

	public Raridade getRaridade() {
		return raridade;
	}

	public void setRaridade(Raridade raridade) {
		this.raridade = raridade;
	}

	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}
	
	

}
