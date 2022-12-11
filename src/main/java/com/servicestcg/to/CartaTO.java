package com.servicestcg.to;



public class CartaTO {

	private final long id;
	
	private final String nome;
	
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
}