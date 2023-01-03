package com.servicestcg.servicestcg.controller;

import java.util.ArrayList;
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
import com.servicestcg.to.CartaTO;
import com.servicestcg.to.ComboTO;
import com.servicestcg.to.EdicaoTO;
import com.servicestcg.to.ListaTO;
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
	
	@PostMapping("/carta/salvar")
	public ResponseTO salvarCarta(@RequestBody CartaTO cartaTO) {
		CartaMapper cartaMapper = new CartaMapper();
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
	//TODO
	@PostMapping("/listas/remover/desejo")
	public ResponseTO removerCartaListaDesejo(@RequestBody CartaClienteTO cartaClienteTO) {
		ResponseTO responseTO = new ResponseTO();
		System.out.println("CARTA CLIENTE REMOVER");
		Listas lista = new Listas();
		System.out.println(cartaClienteTO.getCartaId());
		System.out.println(cartaClienteTO.getClienteId());
		//listasRepository.save(lista);
		return responseTO;
	}
	
	@PostMapping("/listas/adicionar/desejo")
	public ResponseTO adicionarCartaListaDesejo(@RequestBody CartaClienteTO cartaClienteTO) {
		ResponseTO responseTO = new ResponseTO();
		Listas lista = new Listas();
		System.out.println("CARTA CLIENTE ADICIONAR");
		System.out.println(cartaClienteTO.getCartaId());
		System.out.println(cartaClienteTO.getClienteId());
		//listasRepository.save(lista);
		return responseTO;
	}
	
	@PostMapping("/listas/salvar")
	public ResponseTO salvarLista(@RequestBody ListaTO listaTO) {
		ResponseTO responseTO = new ResponseTO();
		Listas lista = new Listas();
		lista.setData_criacao(listaTO.getData_criacao());
		lista.setTipoLista(tipoListaRepository.findById(listaTO.getTipoLista()) );
		lista.setCliente(clienteRepository.findById(listaTO.getCliente()) );
		lista.setConteudo(listaTO.getConteudo());
		System.out.println("CONTEUDO");
		System.out.println(lista.getConteudo());
		//listasRepository.save(lista);
		return responseTO;
	}
	
	@GetMapping("/listas/consultar")
	public List<Listas> getListas(@RequestParam(value = "clienteId", defaultValue = "1") String clienteId, 
			@RequestParam(value = "tipoListaId", defaultValue = "1") String tipoListaId){
		List<Listas> listas = listasRepository.findByCliente(clienteRepository.findById(Long.parseLong(clienteId)));
		List<Listas> listasRetorno = new ArrayList<Listas>();
		for(Listas lista : listas) {
			if(lista.getTipoLista().getTipo_lista_id() == Long.parseLong(tipoListaId)) {
				listasRetorno.add(lista);
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
