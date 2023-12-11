package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Tesouro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int moedas = entrada.nextInt();
		int marinheiros = entrada.nextInt();
		int capitao, divisao;
		
		capitao = 2;
		divisao = moedas/(marinheiros + capitao);
		System.out.println("O capitao recebeu " + 2*divisao);



	}//fim main

}//fim class
