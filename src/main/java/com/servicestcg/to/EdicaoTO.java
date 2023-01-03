package com.servicestcg.to;

public class EdicaoTO {

	private long edicao_id;
	private String nome;
	private String ano;
	private long jogo;
	
	
	public EdicaoTO() {
		
	}


	public long getEdicao_id() {
		return edicao_id;
	}


	public void setEdicao_id(long edicao_id) {
		this.edicao_id = edicao_id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
