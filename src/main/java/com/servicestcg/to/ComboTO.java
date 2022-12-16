package com.servicestcg.to;

import java.util.List;

import com.servicestcg.servicestcg.entity.Edicao;
import com.servicestcg.servicestcg.entity.Idioma;
import com.servicestcg.servicestcg.entity.Jogo;
import com.servicestcg.servicestcg.entity.Natureza;
import com.servicestcg.servicestcg.entity.Qualidade;
import com.servicestcg.servicestcg.entity.Raridade;

public class ComboTO {
	
	private List<Natureza> natureza;
	private List<Raridade> raridade;
	private List<Edicao> edicao;
	private List<Qualidade> qualidade;
	private List<Idioma> idioma;
	private List<Jogo> jogo;
	
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

	public List<Qualidade> getQualidade() {
		return qualidade;
	}

	public void setQualidade(List<Qualidade> qualidade) {
		this.qualidade = qualidade;
	}

	public List<Idioma> getIdioma() {
		return idioma;
	}

	public void setIdioma(List<Idioma> idioma) {
		this.idioma = idioma;
	}

	public List<Jogo> getJogo() {
		return jogo;
	}

	public void setJogo(List<Jogo> jogo) {
		this.jogo = jogo;
	}
	
	
}
