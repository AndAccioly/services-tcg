package com.servicestcg.servicestcg.mapper;

import java.util.ArrayList;
import java.util.List;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.entity.Listas;
import com.servicestcg.to.CartaTO;
import com.servicestcg.to.ListasTO;

public class ListasMapper {

	public ListasTO mapear(Listas lista, List<Carta> cartas) {
		ListasTO listaTO = new ListasTO();
		CartaMapper cartaMapper = new CartaMapper();
		List<CartaTO> cartasTO = new ArrayList<CartaTO>();
		for(Carta carta : cartas) {
			cartasTO.add(cartaMapper.entityParaTo(carta));
		}
		listaTO.setCartasTO(cartasTO);
		listaTO.setCliente(lista.getCliente().getCliente_id());
		listaTO.setTipoLista(lista.getTipoLista().getTipo_lista_id());
		listaTO.setListas_id(lista.getListas_id());
		listaTO.setData_criacao(lista.getData_criacao());
		
		return listaTO;
	}
	
}
