package com.crispimluiz.senai.sobrecargaDeConstrutores;

public class SobreCargaDeConstrutores {
	SobreCargaDeConstrutores(){
		System.out.println("Sem Argumentos");
	}
	
	SobreCargaDeConstrutores(int i){
		//para invocar o construtor sem argumentos
		this("s");
		System.out.println("Construtor int");
	}
	
	SobreCargaDeConstrutores(String i){
		System.out.println("Construtor String");
	}
//Pode ter 0 ao infinito de argumentos
	SobreCargaDeConstrutores(String... varargs){
		System.out.println("Construtor Varargs");
	}
}
