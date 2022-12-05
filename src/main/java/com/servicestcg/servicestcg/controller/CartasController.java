package com.servicestcg.servicestcg.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.repository.CartasRepository;

@RestController
public class CartasController {
	
	@Autowired
	private CartasRepository cartasRepository;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/teste")
	public Carta teste(@RequestParam(value = "name", defaultValue = "World") String nome) {
		Carta carta = cartasRepository.findById(1);
		System.out.println(carta.getNome());
		return new Carta(counter.incrementAndGet(), String.format(template, nome));
	}
	
}
