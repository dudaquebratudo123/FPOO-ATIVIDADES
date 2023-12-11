package Aula_1906;

import java.util.Scanner;

public class Excecao7 {

	public static void main(String[] args) {
		String cpf; //123.456.789-00 - válido!
		Scanner entrada = new Scanner (System.in);
		while(true) {
			try {
				System.out.println("digite o cpf:");
				cpf = entrada.nextLine();
				if (!validarCPF(cpf)){
					throw new IllegalArgumentException("CPF inválido" + "Digite novamente");
				}//fim if
				break;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}//fim catch
		}//fim while
		System.out.println("CPF válido" + cpf);
		entrada.close();
	}//fim main
	
	//*********************************************************************************************
	
		//criar a função (método) para validar CPF
		public static boolean validarCPF(String cpf){// boolean pq ou digitou certo ou errado
			//eliminar caracteres especiais
			cpf = cpf.replaceAll("\\D", "");
		    //verifica quantidade de caracteres
			if(cpf.length() != 11){
				return false;
			}//fim if1
			//verificar se todos os digitos são iguais
			if(cpf.matches("\\d\\\1{10}")) {
				return false;
			}//fim if2
			return true;
		}//fim validar cpf
		
	}//fim classe
