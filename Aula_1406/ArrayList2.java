package Aula_1406;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//criando a lista vazia de tipo inteiro
		ArrayList<Integer> lista = new ArrayList<Integer>(5);
		//adicionar numeros (elementos/itens) na lista
		lista.add(10);
		lista.add(20);
		lista.add(-50);
		lista.add(100);
		lista.add(35);
		//ler os valores que estão na lista
		for(Integer olho : lista) {
			System.out.println("numero = " + olho);
		}
		int ver_conteudo = lista.get(4);
		System.out.println("conteudo é " + ver_conteudo);

	}

}
