package com.servicestcg.servicestcg.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001TIPO_LISTA")
public class TipoLista {
	
	@Id
	private final long tipo_lista_id;
	
	private final String nome;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoLista", fetch = FetchType.LAZY)
	private List<Listas> listas;
	
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
