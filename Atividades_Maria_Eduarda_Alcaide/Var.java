package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		if (x < -8 || x > 8 || y < 0 || y > 8) {
			System.out.println("Bola fora");
		}else {
			System.out.println("Bola dentro");
		}

	}//fim main

}//fim classe