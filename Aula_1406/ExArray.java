package Aula_1406;

import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		
		int[] notas = new int[2];
		int i;
		
		Scanner entrada = new Scanner(System.in);
		
		for(i = 0; i < 2; i++){
			System.out.print("Entre com número" + (i + 1) + ":");
			notas[i] = entrada.nextInt();
		} //fim for
		
		for(i=0; i < 2; i++) {
			System.out.printf("\nnumero %d --> nota armazenada: %d", (i + 1), notas[i]);
		}//fim for
		
		int soma = 0;
		for(i = 0; i < 2; i++) {
			soma = soma + notas[1];
		}//fim for
		
		int media = soma / notas.length;
		System.out.println("\na media das notas e: " + media);
		
	} //fim main
	
}//fim classe

		
//System.out.println("Resultado = " + ((notas[0] + notas[1])/2);

//exibir (ler) vetores -- usa o for