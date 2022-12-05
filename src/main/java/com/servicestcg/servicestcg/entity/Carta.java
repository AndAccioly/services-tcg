package com.servicestcg.servicestcg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "teste")
public class Carta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	
	@Column(nullable = false, length = 20)
	private final String nome;
	
	public Carta() {
		this.id = 0;
		this.nome = "";
		
	}

	public Carta(long id, String nome) {
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
