package Aula_1406;

import java.util.Scanner;

public class Album2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("espacos no album:");
		int n = entrada.nextInt();
		System.out.println("figurinhas compradas:");
		int m = entrada.nextInt();
		int x = 0;// fig compradas 
		Boolean[] ja_tenho = new Boolean[n]; // confirmar se tem ou não
		//varrendo o vetor
		for (int i = 0; i < n; i++) {
			ja_tenho[i] = false;
		}
		for (int i = 0; i < m; i++) {
			x = entrada.nextInt();
			ja_tenho[x] = true;
		}
		int repetidas = 0;
		for(int i = 0; i < n; i++) {
			if (ja_tenho[i]) {
				repetidas = repetidas + 1;
			}
		}
		System.out.println("quantidade de figurinhas repetidas = " + (n - repetidas));
		System.out.println("tamanho do album = " + n);
		System.out.println("quantidade de figurinhas = " + m);
		
	}//fim main

}//fim classe
