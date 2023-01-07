package com.servicestcg.servicestcg.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicestcg.servicestcg.entity.Carta;
import com.servicestcg.servicestcg.entity.Cliente;
import com.servicestcg.servicestcg.entity.Edicao;
import com.servicestcg.servicestcg.entity.Listas;
import com.servicestcg.servicestcg.entity.Pedido;
import com.servicestcg.servicestcg.entity.Produto;
import com.servicestcg.servicestcg.mapper.CartaMapper;
import com.servicestcg.servicestcg.mapper.ListasMapper;
import com.servicestcg.servicestcg.repository.CartasRepository;
import com.servicestcg.servicestcg.repository.ClienteRepository;
import com.servicestcg.servicestcg.repository.EdicaoRepository;
import com.servicestcg.servicestcg.repository.IdiomaRepository;
import com.servicestcg.servicestcg.repository.JogoRepository;
import com.servicestcg.servicestcg.repository.ListasRepository;
import com.servicestcg.servicestcg.repository.NaturezaRepository;
import com.servicestcg.servicestcg.repository.PedidoRepository;
import com.servicestcg.servicestcg.repository.ProdutoRepository;
import com.servicestcg.servicestcg.repository.QualidadeRepository;
import com.servicestcg.servicestcg.repository.RaridadeRepository;
import com.servicestcg.servicestcg.repository.TipoListaRepository;
import com.servicestcg.to.CartaClienteTO;
import com.servicestcg.to.CartaCompletaTO;
import com.servicestcg.to.CartaTO;
import com.servicestcg.to.ComboTO;
import com.servicestcg.to.EdicaoTO;
import com.servicestcg.to.ListasTO;
import com.servicestcg.to.ResponseTO;

@RestController
@CrossOrigin
public class CartasController {
	
	@Autowired
	private CartasRepository cartasRepository;
	
	@Autowired
	private JogoRepository jogosRepository;
	
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

	@Autowired
	private TipoListaRepository tipoListaRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	CartaMapper cartaMapper = new CartaMapper();
	ListasMapper listasMapper = new ListasMapper();
	
	@PostMapping("/carta/salvar")
	public ResponseTO salvarCarta(@RequestBody CartaTO cartaTO) {
		Carta carta = cartaMapper.toParaEntity(cartaTO);
		carta.setEdicao(edicaoRepository.findById(cartaTO.getEdicao()));
		carta.setRaridade(raridadeRepository.findById(cartaTO.getRaridade()));
		carta.setNatureza(naturezaRepository.findById(cartaTO.getNatureza()));
		carta.setIdioma(idiomaRepository.findById(cartaTO.getIdioma()));
		carta.setQualidade(qualidadeRepository.findById(cartaTO.getQualidade()));
		cartasRepository.save(carta);
		return new ResponseTO();
	}
	
	@PostMapping("/edicao/salvar")
	public ResponseTO salvarEdicao(@RequestBody EdicaoTO edicaoTO) {
		ResponseTO responseTO = new ResponseTO();
		Edicao edicao = new Edicao();
		edicao.setAno(edicaoTO.getAno());
		edicao.setJogo(edicaoTO.getJogo());
		edicao.setNome(edicaoTO.getNome());
		edicaoRepository.save(edicao);
		return responseTO;
	}

	@PostMapping("/listas/remover")
	public ResponseTO removerCartaListaDesejo(@RequestBody CartaClienteTO cartaClienteTO) {
		ResponseTO responseTO = new ResponseTO();
		List<Listas> listas = listasRepository.findByCliente(clienteRepository.findById(cartaClienteTO.getClienteId()));
		
		for(Listas lista : listas) {
			System.out.println("Aqui");
			System.out.println(cartaClienteTO.getTipoListaId());
			System.out.println(lista.getTipoLista().getTipo_lista_id());
			if(lista.getTipoLista().getTipo_lista_id() == cartaClienteTO.getTipoListaId()) {
				String[] splitted = lista.getConteudo().split(";");
				String aux = "";
				for (String split : splitted) {
					if(!split.equals(cartaClienteTO.getCartaId() + "") ){
						aux += split + ";";
					}
				}
				lista.setConteudo(aux);
				listasRepository.save(lista);
			}
		}
		return responseTO;
	}
	
	@PostMapping("/listas/adicionar")
	public ResponseTO adicionarCartaListaDesejo(@RequestBody CartaClienteTO cartaClienteTO) {
		ResponseTO responseTO = new ResponseTO();
		boolean naoExiste = true;
		List<Listas> listas = listasRepository.findByCliente(clienteRepository.findById(cartaClienteTO.getClienteId()));
		
		for(Listas lista : listas) {
			if(lista.getTipoLista().getTipo_lista_id() == cartaClienteTO.getTipoListaId()) {
				naoExiste = false;
				lista.setConteudo(lista.getConteudo() + ';' + cartaClienteTO.getCartaId());
				listasRepository.save(lista);
			}
		}
		
		if(naoExiste) {
			Listas lista = new Listas();
			lista.setConteudo("" + cartaClienteTO.getCartaId());
			lista.setCliente(clienteRepository.findById(cartaClienteTO.getClienteId()));
			lista.setData_criacao(new Date());
			lista.setTipoLista(tipoListaRepository.findById(cartaClienteTO.getTipoListaId()));
			listasRepository.save(lista);
		}
		return responseTO;
	}
	

	@GetMapping("/carta/consultar/edicao")
	public List<CartaCompletaTO> getListasEdicao(@RequestParam(value = "edicao", defaultValue = "1") String edicao){
		System.out.println("Consultando lista por edicao");
		List<CartaCompletaTO> cartasCompletasTO= new ArrayList<CartaCompletaTO>();
		List<Carta> cartas = cartasRepository.findByEdicao(edicaoRepository.findById(Long.parseLong(edicao))); 
		for(Carta carta : cartas) {
			cartasCompletasTO.add(cartaMapper.cartaToCartaCompleta(cartaMapper.entityParaTo(carta), carta));
		}
		return cartasCompletasTO;
	}
	
	@GetMapping("/listas/consultar")
	public List<ListasTO> getListas(@RequestParam(value = "clienteId", defaultValue = "1") String clienteId, 
			@RequestParam(value = "tipoListaId", defaultValue = "1") String tipoListaId){
		List<Listas> listas = listasRepository.findByCliente(clienteRepository.findById(Long.parseLong(clienteId)));
		List<ListasTO> listasRetorno = new ArrayList<ListasTO>();
		System.out.println("Consultando lista");
		for(Listas lista : listas) {
			System.out.println(lista.getConteudo() + " " + Long.parseLong(tipoListaId) + " " + lista.getTipoLista().getTipo_lista_id());
			if(lista.getTipoLista().getTipo_lista_id() == Long.parseLong(tipoListaId)) {
				System.out.println("Lista encontrada");	
				String[] splitted = lista.getConteudo().split(";");
				List<Carta> cartas = new ArrayList<Carta>();
				for(String split : splitted) {
					cartas.add(cartasRepository.findById(Long.parseLong(split)));
				}
				listasRetorno.add(listasMapper.mapear(lista, cartas));
			}
		}
		return listasRetorno;
	}
	
	@GetMapping("/carta/consultar")
	public CartaTO teste(@RequestParam(value = "id", defaultValue = "1") String id) {
		CartaMapper cartaMapper = new CartaMapper();
		CartaTO cartaTO = cartaMapper.entityParaTo(cartasRepository.findById(Long.parseLong(id)));
		return cartaTO;
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
	
	@GetMapping("/pedido/consultar")
	public Pedido getPedido(@RequestParam(value = "id", defaultValue = "1") String id){
		Pedido produto = pedidoRepository.findById(Long.parseLong(id));;
		return produto;
	}
	
	@GetMapping("/utils/lista/combos")
	public ComboTO getCombos(@RequestParam(value = "jogo", defaultValue = "1") String jogo){
		ComboTO comboTO = new ComboTO();
		comboTO.setRaridade(raridadeRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setNatureza(naturezaRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setEdicao(edicaoRepository.findByJogo(Long.parseLong(jogo)));
		comboTO.setQualidade(qualidadeRepository.findAll());
		comboTO.setIdioma(idiomaRepository.findAll());
		comboTO.setJogo(jogosRepository.findAll());
		return comboTO;
	}
}
