package com.servicestcg.to;

public class RaridadeTO {
	
	private final long id;
	
	private String nome;
	private String sigla;
	private long jogo;
	
	public RaridadeTO() {
		this.id = 0;
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

	public long getId() {
		return id;
	}
	
	
}
