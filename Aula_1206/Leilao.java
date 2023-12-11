package Aula_1206;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("lances recebidos");
		int numero = entrada.nextInt();
		int v = 0;
		int [] n = {v}; // vetor do valor
		String c = null; // vazia
		String []n1 =  {c}; // vetor nome
		
		for (int i = 0; i < numero; i++) {//estrutura para dar os lançes
			System.out.println("nome:");
			String c1 = entrada.next();
			System.out.println("valor:");
			int lance = entrada.nextInt();
			
			if (lance > n[0]) {
				n[0] = lance; // guarda o lance no vetor
				n1[0] = c1;
			}
		}
		System.out.printf("nome: %s\n", n1[0]);
		System.out.printf("valor: %d\n",  n[0]);
		
	/*ystem.out.printn("Quantidade de laces recebidos:");
		int N = entrada.nextInt();
		System.out.println("Lance 1");
		String C = entrada.next();
		int V = entrada.nextInt();
		System.out.println("Lance 2");
		String D = entrada.next();
		int W = entrada.nextInt();

		int valor; //armazena o numero do usuário
		int maior = 0;//armazena o maior lance
		boolean primeiro_lance = true;
		
		while(true){
			V = entrada.nextInt();
			
			if(V == 0) {
				break;
			}//fim if1
			
			if(primeiro_lance) {
				maior =V;
				primeiro_lance = false;
			}else if(V >maior){ //fim if2
				maior = V;
			}//fim if-else-if

			if(primeiro_lance) {
				System.out.println("nenhum numero foi digitado!");
			}else {
				System.out.println(maior);
			}//fim if-else
			
		}//fim while*/
	}//fim main

}//fim classe
