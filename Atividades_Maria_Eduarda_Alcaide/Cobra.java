package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Cobra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a sequência:");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		if (a == c || b == d) {
			System.out.println("V");
		}else {
			System.out.println("F");
		}
	}//fim main

}//fim classe
