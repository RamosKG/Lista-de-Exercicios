package br.com.db1.exercicio05;

import java.util.Date;
import java.util.List;

public class Pessoa<telefone> {

	 private String nome; 
	 private Date dataNascimento;
	 private Sexo sexo;
	 private List<telefone>telefones;
	
	 
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public List<telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<telefone> telefones) {
		this.telefones = telefones;
	} 
}


