package com.servicestcg.servicestcg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "T001CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long cliente_id;
	
	@Column(nullable=false)
	private String user_name;
	
	@Column(nullable=false)
	private String email;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Endereco> enderecos;
	 
	private Integer endereco_principal;
	
	private String telefone;
	private Integer tipo_cliente;
	
	
	public Cliente() {
		this.cliente_id = 0;
		
	}

	public Cliente(long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Integer getEndereco_principal() {
		return endereco_principal;
	}

	public void setEndereco_principal(Integer endereco_principal) {
		this.endereco_principal = endereco_principal;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(Integer tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	public long getCliente_id() {
		return cliente_id;
	}
	
}
