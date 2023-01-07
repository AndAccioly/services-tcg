package com.servicestcg.to;

import java.util.Date;
import java.util.List;

public class ListasTO {

	private long listas_id;
	private Date data_criacao;
	private long tipoLista;
	private long cliente;
	private List<CartaTO> cartasTO;
	
	public ListasTO() {}
	
	public long getListas_id() {
		return listas_id;
	}
	
	public void setListas_id(long listas_id) {
		this.listas_id = listas_id;
	}
	
	public Date getData_criacao() {
		return data_criacao;
	}
	
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	public long getTipoLista() {
		return tipoLista;
	}
	
	public void setTipoLista(long tipoLista) {
		this.tipoLista = tipoLista;
	}
	
	public long getCliente() {
		return cliente;
	}
	
	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public List<CartaTO> getCartasTO() {
		return cartasTO;
	}

	public void setCartasTO(List<CartaTO> cartasTO) {
		this.cartasTO = cartasTO;
	}
	
	
	
}
