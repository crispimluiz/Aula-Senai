package com.crispimluiz.senai.Polimorfirmo;

public class Teste {
	
	public static void barulho(Animal animal) {
/*Se for colocado qualquer classe extends animal,
		puxará o método*/
		animal.fazerBarulho();
	}
	
	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Galinha gal = new Galinha();
		
		barulho(cao);
		barulho(gal);
	}
}
