package Aula_0409;

public class Livro {
	//atibutos
	public String autor;
	public String titulo;
	
	//const.
	public Livro() {
		
	}
	public Livro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
	}
	
	//get e set
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
