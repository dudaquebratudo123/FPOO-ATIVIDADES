package Aula_1906;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ececao6 {

	public static void main(String[] args) {
		try {
		File arquivo = new File ("C:\\Users\\Instrutor\\Desktop/texto.txt");
		Scanner entrada = new Scanner (arquivo, "UTF-8");
			while(entrada.hasNextLine()) {
				String linha = entrada.nextLine();
				System.out.println("texto do arquivo: " + linha);
			}//fim while
			entrada.close();// fecha arquivo (libera memoria)
		}catch (FileNotFoundException e){// fim try
			System.out.println("o arquivo não foi encontrado");
		}catch (Exception e){//fim catch1
			System.out.println("ocorreu um erro durante a leitura do arquivo;" + e.getMessage());;
		}//fim catch2
			System.out.println("o programa foi encerrado!");
	} //fim main

}//fim classe
