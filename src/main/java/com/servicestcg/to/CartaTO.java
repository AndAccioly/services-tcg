package com.servicestcg.to;

import java.sql.Date;

public class CartaTO {

	private long id;
	private String descricao;
	private String nome;
	private String imagem;
	private long edicao;
	private long idioma;
	private long natureza;
	private long raridade;
	private long qualidade;
	private long nivel;
	private Double valor;
	private Integer estoque;
	private Date data_inicio;
	private Date data_fim;
	
	public CartaTO() {
		this.id = 0;
		this.nome = "";
		
	}

	public CartaTO(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public long getEdicao() {
		return edicao;
	}

	public void setEdicao(long edicao) {
		this.edicao = edicao;
	}

	public long getIdioma() {
		return idioma;
	}

	public void setIdioma(long idioma) {
		this.idioma = idioma;
	}

	public long getNatureza() {
		return natureza;
	}

	public void setNatureza(long natureza) {
		this.natureza = natureza;
	}

	public long getRaridade() {
		return raridade;
	}

	public void setRaridade(long raridade) {
		this.raridade = raridade;
	}

	public long getQualidade() {
		return qualidade;
	}

	public void setQualidade(long qualidade) {
		this.qualidade = qualidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
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
	
	
}
