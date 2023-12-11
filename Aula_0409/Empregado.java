package Aula_0409;

public class Empregado {
	//atributos
		public String nome;
		
	//construtores
	public Empregado() {
		
	}
	public Empregado (String nome) {
		this.nome = nome;
	}
		
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
