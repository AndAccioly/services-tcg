package com.servicestcg.to;

import java.util.List;

import com.servicestcg.servicestcg.entity.Edicao;
import com.servicestcg.servicestcg.entity.Natureza;
import com.servicestcg.servicestcg.entity.Raridade;

public class ComboTO {
	
	private List<Natureza> natureza;
	private List<Raridade> raridade;
	private List<Edicao> edicao;
	
	public List<Natureza> getNatureza() {
		return natureza;
	}
	
	public void setNatureza(List<Natureza> natureza) {
		this.natureza = natureza;
	}
	
	public List<Raridade> getRaridade() {
		return raridade;
	}
	 
	public void setRaridade(List<Raridade> raridade) {
		this.raridade = raridade;
	}

	public List<Edicao> getEdicao() {
		return edicao;
	}

	public void setEdicao(List<Edicao> edicao) {
		this.edicao = edicao;
	}
	
	
}
