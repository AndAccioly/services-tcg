package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "T001LISTAS")
public class Listas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long listas_id;
	private TipoLista tipo_lista; 
	private String conteudo;
	private Date data_criacao;
	Cliente cliente;
	
	public Listas() {
		this.listas_id = 0;
	}

	public TipoLista getTipo_lista() {
		return tipo_lista;
	}

	public void setTipo_lista(TipoLista tipo_lista) {
		this.tipo_lista = tipo_lista;
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

}
