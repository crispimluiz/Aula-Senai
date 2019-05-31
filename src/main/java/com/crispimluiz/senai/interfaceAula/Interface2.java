package com.crispimluiz.senai.interfaceAula;

public class Interface2 implements Interface{
	//Olhe acima o implement Interceface
	public double num;
	public double num2;

	/*O @Override é uma forma de garantir que você está 
	 * sobrescrevendo um método e não criando um novo
	 */
	@Override
	public void getAcelerar() {
		System.out.println("Aceleração motorzão!!!!"); 
		
	}

	//Na Interface coloquei variavel i e j aqui mudei.
	@Override
	public double getSoma(double num, double num2) {
		Double result;
		result = num+num2;
		return result;
	}
}
