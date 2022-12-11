package com.servicestcg.servicestcg.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.entity.Cliente;
import com.servicestcg.servicestcg.entity.Endereco;
import com.servicestcg.servicestcg.entity.Natureza;
import com.servicestcg.servicestcg.entity.Raridade;
import com.servicestcg.servicestcg.repository.CartasRepository;
import com.servicestcg.servicestcg.repository.ClienteRepository;
import com.servicestcg.servicestcg.repository.EdicaoRepository;
import com.servicestcg.servicestcg.repository.EnderecoRepository;
import com.servicestcg.servicestcg.repository.NaturezaRepository;
import com.servicestcg.servicestcg.repository.RaridadeRepository;
import com.servicestcg.to.ComboTO;

@RestController
@CrossOrigin
public class CartasController {
	
	@Autowired
	private CartasRepository cartasRepository;
	
	@Autowired
	private RaridadeRepository raridadeRepository;
	
	@Autowired
	private NaturezaRepository naturezaRepository;
	
	@Autowired
	private EdicaoRepository edicaoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/teste")
	public Carta teste(@RequestParam(value = "name", defaultValue = "World") String nome) {
		Carta carta = cartasRepository.findById(1);
		System.out.println(carta.getNome());
		return new Carta(counter.incrementAndGet(), String.format(template, nome));
	}
	
	@GetMapping("/cliente/consultar")
	public Cliente getCliente(@RequestParam(value = "id", defaultValue = "1") String id){
		Cliente cliente = clienteRepository.findById(Long.parseLong(id));;
		return cliente;
	}
	
	@GetMapping("/utils/lista/combos")
	public ComboTO getCombos(@RequestParam(value = "jogo", defaultValue = "1") String jogo){
		ComboTO comboTO = new ComboTO();
		comboTO.setRaridade(raridadeRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setNatureza(naturezaRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setEdicao(edicaoRepository.findByJogo(Long.parseLong(jogo)));
		return comboTO;
	}
	
//	@GetMapping("/utils/lista/raridade")
//	public List<Raridade> getAllRaridades(@RequestParam(value = "jogo", defaultValue = "1") String jogo){
//		return raridadeRepository.findByJogo(Long.parseLong(jogo));
//	}
	
//	@GetMapping("/utils/lista/natureza")
//	public List<Natureza> getAllNaturezas(@RequestParam(value = "jogo", defaultValue = "1") String jogo){
//		return naturezaRepository.findByJogo(Long.parseLong(jogo));
//	}
	
	
	
//	@GetMapping("/cliente/endereco")
//	public Endereco getEndereco(@RequestParam(value = "id", defaultValue = "1") String id){
//		return enderecoRepository.findById(Long.parseLong(id));
//	}
	
	
}
