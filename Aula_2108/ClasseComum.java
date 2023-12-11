package Aula_2108;

public class ClasseComum {
	//atributos
	public int numero = 10;
	public int idade = 50;
	
	//construtor
	public ClasseComum() {
		
	}
	
	public ClasseComum(int id) {
		super();
		this.idade = id;
	}
	
	//getters e setters
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
