package Atividades_Maria_Eduarda_Alcaide;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVaso {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		//instanciando Vasos
		Vaso vaso1 = new Vaso();
		System.out.println("VASO 1");
		System.out.println("\nCor do vaso: ");
		vaso1.setCor(entrada.next());
		System.out.println("Tamanho do vaso: ");
		vaso1.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso: ");
		vaso1.setMaterial(entrada.next());
		
		//testando metodo especial
		vaso1.exibir(null, 0, null);
		
		Vaso vaso2 = new Vaso();
		System.out.println("\nVASO 2");
		System.out.println("\nCor do vaso: ");
		vaso2.setCor(entrada.next());
		System.out.println("Tamanho do vaso: ");
		vaso2.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso: ");
		vaso2.setMaterial(entrada.next());
		
		//testando metodo especial
		vaso2.exibir(null, 0, null);
		
		//instanciando vasos decorados
		VasoDecorado deco1 = new VasoDecorado();
		System.out.println("\nVASO 3");
		System.out.println("\nCor do vaso: ");
		deco1.setCor(entrada.next());
		System.out.println("Tamanho do vaso: ");
		deco1.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso: ");
		deco1.setMaterial(entrada.next());
		System.out.println("Decoracao: ");
		deco1.setDecoracao(entrada.next());
		
		//testando metodo especial
		deco1.exibir(null, 0, null, null);
		
		VasoDecorado deco2 = new VasoDecorado();
		System.out.println("\nVASO 4");
		System.out.println("Cor do vaso: ");
		deco2.setCor(entrada.next());
		System.out.println("Tamanho do vaso: ");
		deco2.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso: ");
		deco2.setMaterial(entrada.next());
		System.out.println("Decoracao: ");
		deco2.setDecoracao(entrada.next());
		
		//testando metodo especial
		deco2.exibir(null, 0, null, null);
		
	}//fim main

}//fim classe
