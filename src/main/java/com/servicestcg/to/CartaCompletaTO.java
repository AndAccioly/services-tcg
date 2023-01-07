package com.servicestcg.to;

public class CartaCompletaTO {
	private String edicaoDescricao;
	private String idiomaDescricao;
	private String naturezaDescricao;
	private String raridadeDescricao;
	private String qualidadeDescricao;
	private String ano;
	private boolean ehColecao;
	private boolean ehDesejo;
	private CartaTO cartaTO;
	
	public CartaCompletaTO() {}
	
	public String getEdicaoDescricao() {
		return edicaoDescricao;
	}
	public void setEdicaoDescricao(String edicaoDescricao) {
		this.edicaoDescricao = edicaoDescricao;
	}
	public String getIdiomaDescricao() {
		return idiomaDescricao;
	}
	public void setIdiomaDescricao(String idiomaDescricao) {
		this.idiomaDescricao = idiomaDescricao;
	}
	public String getNaturezaDescricao() {
		return naturezaDescricao;
	}
	public void setNaturezaDescricao(String naturezaDescricao) {
		this.naturezaDescricao = naturezaDescricao;
	}
	public String getRaridadeDescricao() {
		return raridadeDescricao;
	}
	public void setRaridadeDescricao(String raridadeDescricao) {
		this.raridadeDescricao = raridadeDescricao;
	}
	public String getQualidadeDescricao() {
		return qualidadeDescricao;
	}
	public void setQualidadeDescricao(String qualidadeDescricao) {
		this.qualidadeDescricao = qualidadeDescricao;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public CartaTO getCartaTO() {
		return cartaTO;
	}
	public void setCartaTO(CartaTO cartaTO) {
		this.cartaTO = cartaTO;
	}

	public boolean isEhColecao() {
		return ehColecao;
	}

	public void setEhColecao(boolean ehColecao) {
		this.ehColecao = ehColecao;
	}

	public boolean isEhDesejo() {
		return ehDesejo;
	}

	public void setEhDesejo(boolean ehDesejo) {
		this.ehDesejo = ehDesejo;
	}
	
	
}
