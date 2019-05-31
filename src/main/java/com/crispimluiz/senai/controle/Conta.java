package com.crispimluiz.senai.controle;

public class Conta {

	private Integer nunConta;
	private String nome;
	private double saldo;
	private double limite;

	void saque(double valor) {
		this.saldo = this.saldo -= valor;
	}

	public int getNunconta() {
		return nunConta;
	}

	// Mudei o set
	public void setNunconta(int nunconta) {
		if (nunconta > 0) {
			this.nunConta = nunconta;
		} else {
			System.out.println("Número inválido");
		}
	}

	// Mudei o get
	public String getNome() {
		if (nome != null) {

		} else {
			System.out.println("Preencha o Nome");
		}
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
