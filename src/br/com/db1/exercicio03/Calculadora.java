package br.com.db1.exercicio03;

public class Calculadora {
	private double resultado;
	private double primeiroValor;
	private double segundoValor;
	private double zerarCalculo;

	public void zerarCalculadora() {
	return;
	}

	public double somar() {
		return primeiroValor + segundoValor;
	}

	public double subtração() {
		return segundoValor - primeiroValor;
	}

	public double multiplicação() {
		return primeiroValor * segundoValor;
	}

	public double divisao() {
		return segundoValor / primeiroValor;
	}

	public double getZerarCalculo() {
		return zerarCalculo;
	}

	public void setZerarCalculo(double zerarCalculo) {
		this.zerarCalculo = zerarCalculo;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(double segundoValor) {
		this.segundoValor = segundoValor;
	}
}
