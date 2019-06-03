package com.crispimluiz.senai.abstrata;

public class Abstracao2 extends Abstracao{
	private static double valor;
	private static double porcentagemValor;
	//teste
	public double getPorcentagem(double valor, double porcentagemValor) {
		double resultado;
		resultado = ((valor * porcentagemValor)/100);
		return resultado;
	}
	
	public Abstracao2() {}

	public Abstracao2(double valor, double porcentagemValor) {
		super();
		Abstracao2.valor = valor;
		Abstracao2.porcentagemValor = porcentagemValor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		Abstracao2.valor = valor;
	}

	public double getPorcentagemValor() {
		return porcentagemValor;
	}

	public void setPorcentagemValor(float porcentagemValor) {
		Abstracao2.porcentagemValor = porcentagemValor;
	}

	@Override
	public double getPorcentagem() {
		// TODO Auto-generated method stub
		return 0;
	}
}
