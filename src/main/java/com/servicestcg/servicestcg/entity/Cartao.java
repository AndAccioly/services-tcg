package com.servicestcg.servicestcg.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "T001CARTAO")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long cartao_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente", nullable=false)
	@JsonBackReference
	private Cliente cliente;
	
	private String numero;
	private String validade;
	private String titular;
	
	public Cartao() {
		this.cartao_id = 0;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getCartao_id() {
		return cartao_id;
	}
	
	
}
