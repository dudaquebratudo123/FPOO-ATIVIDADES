package Aula_2308;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteAnimal1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Animal1> animais = new ArrayList<>();//lista de animais vazia
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o nome do animal" + (i + 1) + " : ");
			String nome = entrada.next();
			System.out.println("Escolha o tipo de animal (cao ou gato)");
			String tipo = entrada.next();
			Animal1 animal;
			if(tipo.equalsIgnoreCase("Cachorro")) {
				animal = new Cachoror (nome);
			}else if(tipo.equalsIgnoreCase("Gato")) {
				animal = new Gato1(nome);
			}else {
			System.out.println("Tipo de animal invalido");
			animal =  new Animal1 (nome);
			}
		animais.add(animal);
			
		}//fim for
		for(Animal1 animal : animais) {//animal percorre animais
			System.out.println("Nome do animal: " + animal.getNome());
			animal.emitirSom();
		}
		
	}//fim main
	
}//fim classe
