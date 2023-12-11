package Aula_0409;

import java.util.List;

public class Biblioteca {
	//atri.
	private List<Livro> livros; //varios livros - *
	
	//const.
	public Biblioteca() {
		
	}
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
	
	//met.
	public List<Livro> getTotalLivrosBiblioteca() {
		return livros;
	}
}
