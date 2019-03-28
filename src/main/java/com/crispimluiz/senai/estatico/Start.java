package com.crispimluiz.senai.estatico;

public class Start {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		//Estanciei 3 objetos pessoas.
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		
//Contador é estático (pertence a classe e não ao objeto)
//Não existe 3 objetos contador
//Existe um que conta
		System.out.println(Pessoa.getContador());
/*Chamei o p1, 
 * mas poderia chamar qualquer um que a resposta seria 3*/
		System.out.println(p1.getContador());
	}
}
