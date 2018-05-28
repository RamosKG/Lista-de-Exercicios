package br.com.db1.exercicio06;

public class Endereco {

	private String logradouro;
	private Integer cep;

	private TipoLogradouro tipoLougradouro;
	public Restaurante restaurante;

	public String exibirCepFormatado() {
		String exibircepFormatado = cep.toString();
		exibircepFormatado = exibircepFormatado.substring(0, 5) + "-" + exibircepFormatado.substring(5, 8);
		return exibircepFormatado;
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
