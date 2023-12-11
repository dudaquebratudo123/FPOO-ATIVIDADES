package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Visitante {
	//atributos
	private String nome;
	private int idade;
	private double altura;

	//construtores
	public Visitante (String nomVis, int ida, double alt) {
		Scanner entrada = new Scanner (System.in);
		this.nome = nomVis;
		this.idade = ida;
		this.altura = alt;
	}
	
	public Visitante() {
		
	}
	
	//metodos nome
	public String getNome() {
		return nome;
	}
		
	public String setNome() {
		return nome;
	}
		
	//metodos altura
	public double getAltura() {
		return altura;
	}
		
	public double setAltura(double a) {
		return altura;
	}
		
	//metodos idade
	public int getIdade() {
		return idade;
	}
		
	public int setIdade() {
		return idade;
	}
	
	//metodo pode andar no brinquedo
	public boolean podeAndarNoBrinquedo() {
		if(altura >= 1.60 && idade >= 12) {
			System.out.println("Voce pode andar no brinquedo");
			return true;
		}else {
			System.out.println("Voce nao pode andar no brinquedo");
			return false;
		}
	}
	
}//fim class
