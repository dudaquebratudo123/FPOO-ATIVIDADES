package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			exibirMenu(); //metodo (ação)
		    opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("opção 1 selecionada");
				break;
			case 2:
				System.out.println("opção 2 selecionada");
				break;
			case 3:
				System.out.println("opção 3 selecionada");
				break;
			default:
				System.out.println("escolha as opcoes de 1 a 3");
			}//fim switch
			
		}//fim do 
		
		while(opcao != 0); 

	}//fim main
	
	//criando o metodo para exibir menu de opções
	public static void exibirMenu() {
		System.out.println("Selecione uma opcao");
		System.out.println("1 - opção 1");
		System.out.println("2 - opção 2");
		System.out.println("3 - opção 3");
		System.out.println("0 - SAIR");
	}

}//fim class
