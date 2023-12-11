package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Cliente {
	//atributos
	public String cpf;
	public String nome;
	public int telefone;
	public int idade;
	public double altura;
	public double peso;

	//metodo IMC
	public void CalcularImc(double peso, double altura) {
		double imc = peso / (altura * altura);
		System.out.println("IMC = " + imc);
		if (imc < 18.5) {
			System.out.println("Seu estado e de magreza!");
		}else if(imc > 18.5 && imc < 24.9){
			System.out.println("Seu estado e normal!");
		}else if(imc > 25 && imc < 29.9){
			System.out.println("Seu estado e de sobrepeso!");
		}else {
			System.out.println("Seu estado e obeso");
		}
	}
	
	//metodo peso desejado
	public void CalcularPesoDesejado(double peso) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Insira sua meta de peso:");
		float meta = entrada.nextInt();
		if(meta > peso) {
			System.out.println("E necessario ganhar: " + (meta - peso));
		}else if (meta < peso) {
			System.out.println("E necessario perder: " + (peso - meta));
		}
	}
	
	//Imprimir dados
	public void ImprimirDados() {
		System.out.println("CPF : " + cpf);
		System.out.println("Nome : " + nome);
		System.out.println("Telefone : " + telefone);
		System.out.println("Idade : " + idade);
		System.out.println("Altura : " + altura);
		System.out.println("Peso : " + peso);
	}
	
}
