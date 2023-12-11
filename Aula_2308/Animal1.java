package Aula_2308;

public class Animal1 {
	//atributos
	private String nome;
	//construtor
	public Animal1(String nome) {
		this.nome = nome;
	}
	//metodos
	public void emitirSom() {
		System.out.println("O animal está emitindo um som");
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
