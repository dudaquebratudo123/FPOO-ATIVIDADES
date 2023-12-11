package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int valor;
		int resultado = 0;
		boolean primeiro_numero = true;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite valores positivos");
		while(true) {
			valor = entrada.nextInt();
			if(valor <= 0){
				System.out.println("Erro! Escreva apenas numeros inteiros");
				break;
			}//fim if
			resultado = resultado + valor;
		}//fim while
		System.out.println("O resultado da soma: " + resultado);
	}//fim main

}//fim classe
