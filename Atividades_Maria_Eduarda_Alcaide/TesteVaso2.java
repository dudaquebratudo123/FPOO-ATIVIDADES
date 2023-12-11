package Atividades_Maria_Eduarda_Alcaide;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVaso2 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		//variavel pra contar os vasos
		int qntvaso = 1;
		//ArrayList
		System.out.println("ArrayList para criar vasos");
		ArrayList<Vaso> vasolist = new ArrayList<>();//lista de vasos vazia
		for(int i = 0; i < 3; i++) { //for para instanciar 2 objs
			System.out.println("\nVaso " + qntvaso++);
			System.out.println("\nCor:");
			String cor = entrada.next();
			System.out.println("Tamanho");
			double tamanho = entrada.nextDouble();
			System.out.println("Material");
			String material = entrada.next();	
			//criando obj vasin que recebe os valores do scanner - ajuda do construtor
			Vaso vasin = new Vaso (cor, tamanho, material);
			//criando vasos
			vasolist.add(vasin);
		}//fim for1
		qntvaso = 1;
		//lendo a array
		for(Vaso vasin : vasolist) {//vasin percorre vaso
			System.out.println("\nVaso " + qntvaso++);
			System.out.println("Cor: " + vasin.getCor());
			System.out.println("Tamanho: " + vasin.getTamanho());
			System.out.println("Material: " + vasin.getMaterial());
		}//fim for2
		
	}//fim main
	
}//fim classe
