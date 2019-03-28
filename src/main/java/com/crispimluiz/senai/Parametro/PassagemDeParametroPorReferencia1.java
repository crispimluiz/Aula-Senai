package com.crispimluiz.senai.Parametro;
public class PassagemDeParametroPorReferencia1 {
	private String nome = "Crispim";
	private String cpf = "11111111111";
	/*Aqui temos um construtor-Ele é criado para quando instanciamos essa classe.
	 Hoje não é mais necessário cria-lo, o Eclipse cria em segundo
	 plano, mas para se ter uma boa estrutura é bom coloca-lo
	 OBS - ESSE MÉTODO E VAZIO*/
	public PassagemDeParametroPorReferencia1() {}
	/*Esse método é usado para refenciar a classe PAI da classe em questão
	 * Exemplo Classe PAI da Classe filho * this - É para referenciar o próprio objeto*/
	public PassagemDeParametroPorReferencia1(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	//GET é para consulta a VARIÁVEL
	public String getNome() {
		return nome;
	}
	//SET é para atribuir valor a VARIÁVEL
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
