package Atividades_Maria_Eduarda_Alcaide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Aula_0409.Estudante;
import Aula_0409.Livro;

public class TesteBanda {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//BANDA 1
		System.out.println("BANDA 1 . . . . . . . . . . . . . ");
			//inst de membros da banda
			System.out.println("\nNomes: ");
			System.out.println("baterita: ");
		    String n1 = entrada.nextLine();
			System.out.println("baixista: ");
			String n2 = entrada.nextLine();
			System.out.println("vocalista: ");
			String n3 = entrada.nextLine();
			System.out.println("guitarrista");
			String n4 = entrada.nextLine();
			
			Baterista bat = new Baterista(n1);
			Baixista bai = new Baixista(n2);
			Vocalista voc = new Vocalista(n3);
			Guitarrista gui = new Guitarrista(n4);
		
			//lista de membros
			List<MembroBanda> membros_list  = new ArrayList<MembroBanda>();
			membros_list.add(bat);
			membros_list.add(bai);
			membros_list.add(voc);
			membros_list.add(gui);

			//mostrando alunos da lista
			System.out.println("\nMEMBROS DA BANDA . . .");
			for(MembroBanda vassoura : membros_list) {
				System.out.println("- " + vassoura.getNome());
			}
			
			//intanciando banda
			System.out.println("\nNOME DA BANDA . . .");
			Banda banda1 = new Banda(membros_list);
			banda1.setNome(entrada.next());
			System.out.println("\nmusica desejada: ");
			banda1.setMusica(entrada.next());
			
			//show1
			banda1.realizarShow();
		
		//BANDA 2
		System.out.println("\nBANDA 2 . . . . . . . . . . . . . ");
			//inst de membros da banda
			System.out.println("\nNomes: ");
			System.out.println("baterita: ");
		    String n5 = entrada.next();
			System.out.println("baixista: ");
			String n6 = entrada.next();
			System.out.println("vocalista: ");
			String n7 = entrada.next();
			System.out.println("guitarrista");
			String n8 = entrada.next();
			
			Baterista bat1 = new Baterista(n5);
			Baixista bai1 = new Baixista(n6);
			Vocalista voc1 = new Vocalista(n7);
			Guitarrista gui1 = new Guitarrista(n8);
			
			//lista de membros
			List<MembroBanda> membros_list1  = new ArrayList<MembroBanda>();
			membros_list1.add(bat1);
			membros_list1.add(bai1);
			membros_list1.add(voc1);
			membros_list1.add(gui1);

			//mostrando alunos da lista
			System.out.println("\nMEMBROS DA BANDA . . .");
			for(MembroBanda vassoura : membros_list1) {
				System.out.println("- " + vassoura.getNome());
			}
				
			//intanciando banda
			System.out.println("\nNOME DA BANDA . . .");
			Banda banda2 = new Banda(membros_list1);
			banda2.setNome(entrada.next());
			System.out.println("\nmusica desejada: ");
			banda2.setMusica(entrada.next());
				
			//show1
			banda2.realizarShow();
	}
}
