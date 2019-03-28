package com.crispimluiz.senai.Parametro;

public class PassagemDeParametrosPorValor {//nome da classe
	
	//para o estruturado seria a função, mas no OBJ é o Método
	static void somaValor(int valor) {//método onde será passado o Parametro
		valor = valor + 200;
		System.out.println(valor);
	}
	//para o estruturado seria a função, mas no OBJ é o Método
	static void tipoValor(int valor) {
		valor ++;
		System.out.println(valor);
	}
	//aqui é o main - onde faz a execução do programa.
	public static void main(String[] args) {
		
	int valor = 100;
	int tipoValor = valor;
	System.out.println("----Antes");
	System.out.println(valor);
	System.out.println(tipoValor);
	
	
	System.out.println("----Depois");
	somaValor(valor);//chama o método somaValor
	tipoValor(tipoValor);//chama o método tipoValor
			
	}
}
