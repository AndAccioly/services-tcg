package com.servicestcg.servicestcg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.entity.Cliente;
import com.servicestcg.servicestcg.entity.Listas;
import com.servicestcg.servicestcg.entity.Produto;
import com.servicestcg.servicestcg.repository.CartasRepository;
import com.servicestcg.servicestcg.repository.ClienteRepository;
import com.servicestcg.servicestcg.repository.EdicaoRepository;
import com.servicestcg.servicestcg.repository.IdiomaRepository;
import com.servicestcg.servicestcg.repository.ListasRepository;
import com.servicestcg.servicestcg.repository.NaturezaRepository;
import com.servicestcg.servicestcg.repository.ProdutoRepository;
import com.servicestcg.servicestcg.repository.QualidadeRepository;
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
	private IdiomaRepository idiomaRepository;
	
	@Autowired
	private QualidadeRepository qualidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ListasRepository listasRepository;
	
	@GetMapping("/carta/consultar")
	public Carta teste(@RequestParam(value = "name", defaultValue = "World") String nome) {
		Carta carta = cartasRepository.findById(1);
		return carta;
	}
	
	@GetMapping("/cliente/consultar")
	public Cliente getCliente(@RequestParam(value = "id", defaultValue = "1") String id){
		Cliente cliente = clienteRepository.findById(Long.parseLong(id));;
		return cliente;
	}
	
	@GetMapping("/produto/consultar")
	public Produto getProduto(@RequestParam(value = "id", defaultValue = "1") String id){
		Produto produto = produtoRepository.findById(Long.parseLong(id));;
		return produto;
	}
	
	@GetMapping("/listas/consultar")
	public Listas getListas(@RequestParam(value = "id", defaultValue = "1") String id){
		Listas listas = listasRepository.findById(Long.parseLong(id));
		if(listas == null) {
			listas = new Listas();
		}
		return listas;
	}
	
	@GetMapping("/utils/lista/combos")
	public ComboTO getCombos(@RequestParam(value = "jogo", defaultValue = "1") String jogo){
		ComboTO comboTO = new ComboTO();
		comboTO.setRaridade(raridadeRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setNatureza(naturezaRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setEdicao(edicaoRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setQualidade(qualidadeRepository.findAll());
		comboTO.setIdioma(idiomaRepository.findAll());
		return comboTO;
	}
}
