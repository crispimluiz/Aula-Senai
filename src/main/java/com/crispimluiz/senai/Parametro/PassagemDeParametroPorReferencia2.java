package com.crispimluiz.senai.Parametro;
public class PassagemDeParametroPorReferencia2 {
	//AQUI NOSSO MAIN
	public static void main(String[] args) {
		PassagemDeParametroPorReferencia1 pessoa 
		= new PassagemDeParametroPorReferencia1();
		System.out.println("Nome: "+ pessoa.getNome() + " CPF: "+ pessoa.getCpf());	
		
		/*CHAMA NOSSO MÉTODO, COMO ESTÁ NA MESMA CLASSE NÃO PRECISO INSTANCIAR
		EXEMPLO: PassagemDeParametroPorReferencia1.alterarPessoa
		MAS NOSSO MÉTODO PRECISA SER STATIC*/
		alteraPessoa(pessoa);
	}
	public static void alteraPessoa(PassagemDeParametroPorReferencia1 pessoa) {
		PassagemDeParametroPorReferencia1 pessoa2 
		= new PassagemDeParametroPorReferencia1();
		pessoa2.setNome("Luiz");
		pessoa2.setCpf("22222222222");
		System.out.println("Nome: "+ pessoa2.getNome() + " CPF: "+ pessoa2.getCpf());	
	}
}
