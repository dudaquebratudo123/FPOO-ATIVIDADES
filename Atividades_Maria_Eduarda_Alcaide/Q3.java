package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner (System.in);
        int num_aleatorio = (int)(Math.random () *30 ) + 1;
        int tentativas;
        int contador = 0;
        System.out.println("Start...");
        do {
            System.out.println("digite um numero de 1 a 30");
            tentativas = entrada.nextInt();
            contador++;
            if(tentativas < num_aleatorio) {
            	System.out.println("digite um MAIOR");
            }else if (tentativas > num_aleatorio) {
            	System.out.println("digite um MENOR");
            }else {
            	System.out.println("Acertou! Parabéns!");
            }
        }while (tentativas != num_aleatorio);
            System.out.println("Volte sempre!");
            System.out.println("Numero de tentativas:" + contador);
        }
     }


 




