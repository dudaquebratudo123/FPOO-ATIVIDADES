package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero de postes:");
		int n = entrada.nextInt();
		int subs = 0;
		int cons = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Tamanho dos postes apos o incendio:");
			int x = entrada.nextInt();
			if (x < 50){
				subs++;
			}
			if(x >= 50 && x < 85){
				cons++;
			}
		}//fim for
		System.out.println(subs + "---" + cons);
		
	}//fim main

}// fim  classe
