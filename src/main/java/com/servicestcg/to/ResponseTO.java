package com.servicestcg.to;

public class ResponseTO {

	private String mensagem;
	private boolean erro;
	
	public ResponseTO() {
		this.erro = false;
		this.mensagem = "";
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public boolean isErro() {
		return erro;
	}
	
	public void setErro(boolean erro) {
		this.erro = erro;
	}
	
	
}
