package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "T001LISTAS")
public class Listas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long listas_id;
	
	private String conteudo;
	private Date data_criacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente", nullable=false)
	@JsonBackReference
	Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_lista", nullable=false)
	private TipoLista tipoLista;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	public Listas() {
		this.listas_id = 0;
	}


	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getListas_id() {
		return listas_id;
	}

	public TipoLista getTipoLista() {
		return tipoLista;
	}

	public void setTipoLista(TipoLista tipoLista) {
		this.tipoLista = tipoLista;
	}

}
