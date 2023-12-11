package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int amg1 = entrada.nextInt();
		int amg2 = entrada.nextInt();
		int ingresso = 0;
		
		if(amg1<18) {
			ingresso = ingresso + 15;
		}else if (amg1<60) {
	        ingresso = ingresso + 30;
		}else{
			ingresso = ingresso + 20;
		}
		
		if(amg2<18) {
			ingresso = ingresso + 15;
		}else if (amg2<60) {
	        ingresso = ingresso + 30;
		}else {
			ingresso = ingresso + 20;
		}

	
		System.out.println("Valor a ser pago = R$" + ingresso);
		
	}//fim main

}//fim class
