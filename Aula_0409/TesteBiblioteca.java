package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

	public static void main(String[] args) {
		//inst de livro
		Livro l1 = new Livro("elayne beata", "O amor nao e obvio");
		Livro l2 = new Livro ("fulano sei la", "Assombrando adeline");
		
		//inst lista vazia
		List<Livro> lista_livro = new ArrayList<Livro>();
		lista_livro.add(l1);
		lista_livro.add(l2);
		
		//leitura da lista (for each)
		System.out.println("LIVROS DA LISTA . . . . . . . . ");
		for(Livro mostrar : lista_livro){// livros percorre lista_livro(nome do array) -- Livro: tipo do array
			System.out.println("\n" + mostrar.getAutor() + " - " + mostrar.getTitulo());
		}
		
		//inst biblioteca
		Biblioteca b = new Biblioteca(lista_livro);//a biblioteca é composta por livros - que estao na lista_livro
		List<Livro> li  = b.getTotalLivrosBiblioteca();
		//lendo
		System.out.println("\n\nLIVROS DA LISTA (que estao dentro da biblioteca . . . ");
		for(Livro mostrar : li) {
			System.out.println("\nAutor: " + mostrar.getAutor() + " | Titulo: " + mostrar.getTitulo());
		}
		
	}//fim main

}//fim classe
