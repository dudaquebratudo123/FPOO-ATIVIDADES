package Aula_0409;

public class Pessoa {
	//atribtos
	public String cargo;
	public String nome;
	public int idade;
	
	//constru
	public Pessoa() {
		
	}
	public Pessoa (String cargo, String nome, int idade) {
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
	}
	
	//get e set
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
