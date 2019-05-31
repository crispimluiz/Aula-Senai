package com.crispimluiz.senai.controle;

public class Programa {

	public static void main(String[] args) {
		
		Conta crispim = new Conta();
		crispim.setNome(null);;
		crispim.setNunconta(2);
		crispim.setSaldo(50000);;
		crispim.setLimite(100000);
		
		crispim.saque(2000);
		
		System.out.println(crispim.getNome()  + " - " + crispim.getNunconta() + " - " + crispim.getSaldo());

	}

}
