package com.servicestcg.servicestcg.applicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.repository.CartasRepository;

@Service
public class CartaService {
	
	@Autowired
	private CartasRepository cartasRepository;
	
	public Carta consultarCartas() {
		Carta carta = cartasRepository.findById(1);
		System.out.println(carta.getNome());
		return carta;
	}
}
