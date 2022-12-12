package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long pedido_id;
	
	private String numero;
	private Listas listas;
	private Cliente cliente;
	private Status status;
	private double valor;
	private Cupom cupom;
	private Date data_pedido;
	

	public Pedido() {
		this.pedido_id = 0;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Listas getListas() {
		return listas;
	}


	public void setListas(Listas listas) {
		this.listas = listas;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Cupom getCupom() {
		return cupom;
	}


	public void setCupom(Cupom cupom) {
		this.cupom = cupom;
	}


	public Date getData_pedido() {
		return data_pedido;
	}


	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}


	public long getPedido_id() {
		return pedido_id;
	}
	
	
}
