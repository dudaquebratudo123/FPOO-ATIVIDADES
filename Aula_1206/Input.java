package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner objin = new Scanner(System.in);
		System.out.println("Digite o valor de a:");
		int a = objin.nextInt();
		System.out.println("Digite o valor de b:");
		int b = objin.nextInt();
		if (a > b) {
			System.out.printf("%d\n" , a);
		}else {
			System.out.printf("%d\n" , b);
		}
	}

}
