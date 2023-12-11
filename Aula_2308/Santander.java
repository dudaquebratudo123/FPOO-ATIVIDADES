package Aula_2308;

public class Santander extends CaixaEletronico{
	//metodo
	@Override
	public void sacar (double valor) {
		valor = valor + 1.5; //taxa cobrada pela transição
		System.out.println("O seu saque no caixa eletronico foi = " + valor);
	}
}
