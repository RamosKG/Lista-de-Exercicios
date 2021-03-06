package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

public class Restaurante extends Endereco {

	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	public List<Telefone> telefone;
	public List<Pedido> pedidos;
	public Date dataInicial;
	public Date dataFinal;
	public String gerarRelatorioFaturamento;

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}
	
	}

 