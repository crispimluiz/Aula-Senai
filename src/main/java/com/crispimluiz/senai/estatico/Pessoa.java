package com.crispimluiz.senai.estatico;

public class Pessoa {
	//Pertence ao objeto
	private int idade;
	//Pertence a Classe
	private static int contador;//Já começa com zero
	
	//Constutor --> Método que roda quando criamos o objeto.
	public Pessoa() {
		//Contador = contador +1
		Pessoa.contador = Pessoa.contador+1;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//Métodos acessores vem static também
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Pessoa.contador = contador;
	}
}
