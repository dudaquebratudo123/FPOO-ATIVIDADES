package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Contas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int V = entrada.nextInt();
		int A = entrada.nextInt();
		int F = entrada.nextInt();
		int P = entrada.nextInt();
		
		if(V >= (A + F +P)) {
			System.out.println("3");
		} else if (V >= (A + F) || V >= (A + F) || V >= (F + P)) {
			System.out.println("2");
		} else if (V >= A || V >= F || V >= P) {
			System.out.println("1");
		}
		
	}//fim main
	
}//fim classe

/*

OPÇÃO COM VETOR

Scanner entrada = new Scanner(System.in);
		int  valor= entrada.nextInt();
		int acougue = entrada.nextInt();
		int farmacia = entrada.nextInt();
		int padaria = entrada.nextInt();

(utilizando vetor)
int resp = 0;
int [] contas = {acougue, farmacia, padaria}

if (contas [0] + contas [1] + contas [2] <= valor)
	resp = 3;
  else if (contas [0] + contas [1] <= valor)
	resp = 2;
  else if (contas [0] <= valor)
	resp = 1;
  else 
	resp = 0;
System.out.printf ("%d\n", resp)
	
 */