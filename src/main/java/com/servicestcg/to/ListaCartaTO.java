package com.servicestcg.to;

import java.util.List;

import com.servicestcg.servicestcg.entity.Cliente;
import com.servicestcg.servicestcg.entity.TipoLista;

public class ListaCartaTO {
	private long id;
	private List<CartaTO> cartas;
	private TipoLista tipoLista;
	private Cliente cliente;
	
	public ListaCartaTO() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<CartaTO> getCartas() {
		return cartas;
	}
	public void setCartas(List<CartaTO> cartas) {
		this.cartas = cartas;
	}
	public TipoLista getTipoLista() {
		return tipoLista;
	}
	public void setTipoLista(TipoLista tipoLista) {
		this.tipoLista = tipoLista;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
