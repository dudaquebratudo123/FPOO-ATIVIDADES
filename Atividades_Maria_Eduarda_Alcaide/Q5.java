package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		int Resultado;
	
		do {
			exibirMenu(); //metodo (ação)
		    opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Voce escolheu somar");
				System.out.println("Digite o primeiro numero");
				int A = entrada.nextInt();
				System.out.println("Digite o segundo numero");
				int B = entrada.nextInt();
				Resultado = A + B;
				System.out.println("Resultado = " + Resultado);
				break;
			case 2:
				System.out.println("Voce escolheu subtrair");
				System.out.println("Digite o primeiro numero");
				int C = entrada.nextInt();
				System.out.println("Digite o segundo numero");
				int D = entrada.nextInt();
				Resultado = C - D;
				System.out.println("Resultado = " + Resultado);
				break;
			case 3:
				System.out.println("Voce escolheu multiplicar");
				System.out.println("Digite o primeiro numero");
				int E = entrada.nextInt();
				System.out.println("Digite o segundo numero");
				int F = entrada.nextInt();
				Resultado = E * F;
				System.out.println("Resultado = " + Resultado);
				break;
			case 4:
				System.out.println("Voce escolheu dividir");
				System.out.println("Digite o primeiro numero");
				int G = entrada.nextInt();
				System.out.println("Digite o segundo numero");
				int H = entrada.nextInt();
				Resultado = G / H;
				System.out.println("Resultado = " + Resultado);
			
			}//fim switch
			
		}//fim do 
		
		while(opcao != 0); 
		
	}//fim main
	
	//criando o metodo para exibir menu de opções
			public static void exibirMenu() {
				System.out.println("Selecione uma operacao");
				System.out.println("1 - Soma");
				System.out.println("2 - Subtracao");
				System.out.println("3 - Multiplicacao");
				System.out.println("4 - Divisao");
				System.out.println("0 - SAIR");
			}


}//fim class
