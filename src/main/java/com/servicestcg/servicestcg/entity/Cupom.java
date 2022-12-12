package com.servicestcg.servicestcg.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "T001CUPOM")
public class Cupom {

	@Id
	private final long cupom_id;
	private String nome;
	
	private Double valor_max;
	private Double por_centagem;
	private Date data_inicio;
	private Date data_validade;
	private TipoCupom tipo_cupom;
	private Cliente cliente;
	private boolean valido;
	
	public Cupom() {
		this.cupom_id = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor_max() {
		return valor_max;
	}

	public void setValor_max(Double valor_max) {
		this.valor_max = valor_max;
	}

	public Double getPor_centagem() {
		return por_centagem;
	}

	public void setPor_centagem(Double por_centagem) {
		this.por_centagem = por_centagem;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_validade() {
		return data_validade;
	}

	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}

	public TipoCupom getTipo_cupom() {
		return tipo_cupom;
	}

	public void setTipo_cupom(TipoCupom tipo_cupom) {
		this.tipo_cupom = tipo_cupom;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public long getCupom_id() {
		return cupom_id;
	}
	
	
}
