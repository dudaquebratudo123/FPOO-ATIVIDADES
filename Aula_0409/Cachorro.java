package Aula_0409;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int QtdPatas;
	
	//construtor
	public Cachorro() {
		
	}
	public Cachorro(String nome, float peso, char sexo, int QtdPatas) {
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.QtdPatas = QtdPatas;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	public float getPeso() {
		return this.peso;
	}
	public char getSexo() {
		return this.sexo;
	}
	public int getQtdPatas() {
		return this.QtdPatas;
	}
	
	//metodos
	public void latir() {
		System.out.println("O cachorro está latindo . . . ");
	}
	public void correr(){
		System.out.println("O cachorro está correndo . . . ");
	}
	public void dormir(){
		System.out.println("O cachorro está dormindo . . . ");
	}
	public void brincar(){
		System.out.println("O cachorro está brincando");
	}
	
	//metodo especial
	public void exibirDados() {
			System.out.println("Nome: " + getNome());
			System.out.println("Peso: " + getPeso());
			System.out.println("Sexo: " + getSexo());
			System.out.println("Quantidade de patas: " + getQtdPatas());
	}
}
