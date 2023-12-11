package Atividades_Maria_Eduarda_Alcaide;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//instanciando cliente
		System.out.println("-------------------------- \nINSIRA SEUS DADOS: ");
		System.out.println("nome -");
		String nome = entrada.next();
		System.out.println("sobrenome - ");
		String sobrenome = entrada.next();
		System.out.println("email - ");
		String email = entrada.next();
		Passageiro p1 = new Passageiro(nome, sobrenome, email);
		
		//instanciando voos
		System.out.println("--------------------------- \nDADOS DO VOO: ");
		
			//data de ida e volta
			LocalDate dataIda = null;
			System.out.println("Escolha a data de ida:");
			String dataI = entrada.next();
			dataIda = LocalDate.parse(dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate dataVolta = null;
			System.out.println("Escolha a data de volta: ");
			String dataV = entrada.next();
			dataVolta = LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
		Voo v1 = new Voo("237", "Brasil", "Argentina", 600, dataIda, dataVolta);
		Voo v2 = new Voo("248", "China", "Mexico", 1500, dataIda, dataVolta);
		Voo v3 = new Voo("239", "Canada", "Caribe", 4000, dataIda, dataVolta);
	
		//atribuindo o voo e dados do cliente para a passagem
		Passagem passagem1 = new Passagem(v1, p1);
		Passagem passagem2 = new Passagem(v2, p1);
		Passagem passagem3 = new Passagem(v3, p1);
		
		//comprando a passagem
		System.out.println("Qual voo voce deseja comprar? \nvoo 1 - Argentina"
				+ "\nvoo 2 - Mexico \nvoo 3 - Caribe");
		
		int voo = entrada.nextInt();
		switch (voo) {
		
			case (1):
				System.out.println("VOCE COMPROU O VOO 1!");
				System.out.println(passagem1.toString());
				break;
				
			case (2):
				System.out.println("VOCE COMPROU O VOO 2!");
				System.out.println(passagem2.toString());
				break;
				
			case (3):
				System.out.println("VOCE COMPROU O VOO 3!");
				System.out.println(passagem3.toString());
				break;
				
			default:
				System.out.println("\nNENHUM VOO VÁLIDO!");
				break;
		}//fim switch
		
	}//fim main

}//fim classe
