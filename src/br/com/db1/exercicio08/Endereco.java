package br.com.db1.exercicio08;

public class Endereco {

	private String logradouro;
	private Integer cep;

	public Pessoa pessoa;
	private TipoLogradouro tipoLogradouro;

	public String exibirCepFormatado() {
		return "";
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

}
