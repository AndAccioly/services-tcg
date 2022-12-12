package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001HIST_PEDIDO")
public class HistPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long hist_pedido_id;
	
	private Pedido pedido;
	
	private Status status;
	private Date data_alteracao;
	
	public HistPedido() {
		this.hist_pedido_id = 0;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao(Date data_alteracao) {
		this.data_alteracao = data_alteracao;
	}

	public long getHist_pedido_id() {
		return hist_pedido_id;
	}
	
	
}
