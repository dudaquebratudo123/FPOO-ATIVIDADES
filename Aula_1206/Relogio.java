package Aula_1206;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		Scanner olho = new Scanner(System.in);
		System.out.println("Digite a frequência cardíaca em repouso:");
		int R = olho.nextInt();
		System.out.println("Digite a frequência cardíaca atual:");
		int F = olho.nextInt();
		System.out.println("Digite a capacidade de oxigenação");
		int C = olho.nextInt();
		
		if ((F > 3*R) || (C < 95)){
			System.out.println("Diminua o rítimo!");
		}else {
			if((F < 2*R) && (C > 97)){
				System.out.println("Aumente o rítimo!");
			}else {
				System.out.println("Mantenha o rítimo");
			}
		}
	}
}
	

