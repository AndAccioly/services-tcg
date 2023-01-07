package com.servicestcg.servicestcg.mapper;

import java.nio.charset.StandardCharsets;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.repository.EdicaoRepository;
import com.servicestcg.to.CartaCompletaTO;
import com.servicestcg.to.CartaTO;

public class CartaMapper {
	
	public Carta toParaEntity(CartaTO cartaTO) {
		Carta carta = new Carta();
		carta.setNome(cartaTO.getNome());
		carta.setDescricao(cartaTO.getDescricao());
		carta.setData_inicio(cartaTO.getData_inicio());
		carta.setData_fim(cartaTO.getData_fim());
		carta.setEstoque(cartaTO.getEstoque());
		carta.setValor(cartaTO.getValor());
		carta.setImagem(cartaTO.getImagem().getBytes());
		
		return carta;
	}
	
	public CartaTO entityParaTo(Carta carta) {
		CartaTO cartaTO = new CartaTO();
		cartaTO.setId(carta.getCarta_id());
		cartaTO.setNome(carta.getNome());
		cartaTO.setDescricao(carta.getDescricao());
		cartaTO.setEstoque(carta.getEstoque());
		cartaTO.setValor(carta.getValor());
		cartaTO.setImagem(new String(carta.getImagem(), StandardCharsets.UTF_8 ));
		cartaTO.setEstoque(carta.getEstoque());
		cartaTO.setData_fim(carta.getData_fim());
		cartaTO.setData_inicio(carta.getData_inicio());
		
		cartaTO.setEdicao(carta.getEdicao().getEdicao_id());
		cartaTO.setQualidade(carta.getQualidade().getQualidade_id());
		cartaTO.setRaridade(carta.getQualidade().getQualidade_id());
		cartaTO.setIdioma(carta.getIdioma().getIdioma_id());
		cartaTO.setNatureza(carta.getNatureza().getNatureza_id());
		
		return cartaTO;
	}

	public CartaCompletaTO cartaToCartaCompleta(CartaTO cartaTO, Carta carta) {
		CartaCompletaTO cartaCompletaTO = new CartaCompletaTO();
		cartaCompletaTO.setCartaTO(cartaTO);
		cartaCompletaTO.setEdicaoDescricao(carta.getEdicao().getNome());
		cartaCompletaTO.setQualidadeDescricao(carta.getQualidade().getNome());
		cartaCompletaTO.setNaturezaDescricao(carta.getNatureza().getNome());
		cartaCompletaTO.setAno(carta.getEdicao().getAno());
		cartaCompletaTO.setIdiomaDescricao(carta.getIdioma().getNome());
		cartaCompletaTO.setRaridadeDescricao(carta.getRaridade().getNome());
		
		return cartaCompletaTO;
	}
}
