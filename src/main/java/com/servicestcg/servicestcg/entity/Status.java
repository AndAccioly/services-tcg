package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001STATUS")
public class Status {

	@Id
	private final long status_id;	
	private String nome;
	
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
