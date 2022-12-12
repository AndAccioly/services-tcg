package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001TIPO_LISTA")
public class TipoLista {
	
	@Id
	private final long tipo_lista_id;
	
	private final String nome;
	
	public TipoLista() {
		this.tipo_lista_id = 0;
		this.nome = "";
	}

	public long getTipo_lista_id() {
		return tipo_lista_id;
	}

	public String getNome() {
		return nome;
	}
	
	

}
