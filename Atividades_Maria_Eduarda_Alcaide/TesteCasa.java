package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);		
		//casa 1
		System.out.println("CASA 1 . . . . . . . . . .");
			//quarto
			System.out.println("QUARTO . . .");
			System.out.println("nome: ");
			String nomeQuarto = entrada.nextLine();
			System.out.println("numero de camas:");
			int numCamas = entrada.nextInt();
				//new quarto
				Quarto q1 = new Quarto(nomeQuarto, numCamas);
			//sala
			System.out.println("SALA . . .");
			System.out.println("nome: ");
			String nomeSala = entrada.nextLine();
			System.out.println("tem tv?");
			boolean temtv = entrada.nextBoolean();
				//new sala
				Sala s1 = new Sala(temtv, nomeSala);
			//instanciando a casa
			Casa casa1 = new Casa(q1, s1);
			System.out.println("CASA . . .");
			System.out.println("cor da casa :");
			casa1.setCor(entrada.next());
			System.out.println("preco da casa : ");
			casa1.setPreco(entrada.nextFloat());
			System.out.println("metragem da casa : ");
			casa1.setMetragem(entrada.nextFloat());
			casa1.mostrarDetalhes();

			//casa 2
			System.out.println("CASA 2 . . . . . . . . . .");
				//quarto
				System.out.println("QUARTO . . .");
				System.out.println("nome: ");
				String nomeQuarto1 = entrada.nextLine();
				System.out.println("numero de camas:");
				int numCamas1 = entrada.nextInt();
					//new quarto
					Quarto q2 = new Quarto(nomeQuarto1, numCamas1);
				//sala
				System.out.println("SALA . . .");
				System.out.println("nome: ");
				String nomeSala1 = entrada.nextLine();
				System.out.println("tem tv?");
				boolean temtv1 = entrada.nextBoolean();
					//new sala
					Sala s2 = new Sala(temtv1, nomeSala1);
				//instanciando a casa
				Casa casa2 = new Casa(q1, s1);
				System.out.println("CASA . . .");
				System.out.println("cor da casa :");
				casa2.setCor(entrada.next());
				System.out.println("preco da casa : ");
				casa2.setPreco(entrada.nextFloat());
				System.out.println("metragem da casa : ");
				casa2.setMetragem(entrada.nextFloat());
				casa2.mostrarDetalhes();
		
		
	}//fim main

}//fim classe
