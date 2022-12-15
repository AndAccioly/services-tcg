package com.servicestcg.servicestcg.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "T001PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long pedido_id;
	
	private String numero;
	
	@OneToOne(mappedBy = "pedido")
	private Listas listas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente", nullable=false)
	@JsonBackReference
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status", nullable=false)
	private Status status;
	
	private double valor;
	
	@OneToOne(mappedBy = "pedido")
	private Cupom cupom;
	
	private Date data_pedido;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<HistPedido> histPedido;

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

	public List<HistPedido> getHistPedido() {
		return histPedido;
	}

	public void setHistPedido(List<HistPedido> histPedido) {
		this.histPedido = histPedido;
	}
	
	
}
