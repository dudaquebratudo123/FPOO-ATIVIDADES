package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int valor; //armazena o numero do usuário
		int menor = 0;//armazena o menor numero digitado
		boolean primeiro_numero = true;//confirma o menor valor
		
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Digite um valor");
			
			while(true){
				valor = entrada.nextInt();
				
				if(valor == 0) {
					break;
				}//fim if1
				
				if(primeiro_numero) {
					menor = valor;
					primeiro_numero = false;
				}else if(valor < menor){ //fim if2
					menor = valor;
				}//fim if-else-if

				if(primeiro_numero) {
					System.out.println("nenhum numero foi digitado!");
				}else {
					System.out.println("o menor numero digitado foi:" + menor);
				}//fim if-else
				
			}//fim while
		}//fim try
		
	}//fim main

}//fim classe
