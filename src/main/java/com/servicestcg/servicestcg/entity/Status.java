package com.servicestcg.servicestcg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001STATUS")
public class Status {

	@Id
	private final long status_id;	
	private String nome;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "status", fetch = FetchType.LAZY)
	private List<Pedido> pedidos;
	
	public Status() {
		this.status_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getStatus_id() {
		return status_id;
	}

}
