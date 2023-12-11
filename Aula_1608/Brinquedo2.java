package Aula_1608;

public class Brinquedo2 {

	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	//metodo construtor
	public Brinquedo2(){
		
	}
	
	public Brinquedo2(String nome, double alturaMinima, int capacidadeMaxima) {
		this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//metodos getters e setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAlturaMinima() {
		return alturaMinima;
	}
	
	public void setAlturaMinima(double altura) {
		this.alturaMinima = altura;
	}
	
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	public void setCapacidadeMaxima(int capMaxima) {
		this.capacidadeMaxima = capMaxima;
	}
	
	//metodo especial
	public void exibirInfo() {
		System.out.println("Brinquedo: " + nome);
		System.out.println("Altura minima: " + alturaMinima);
		System.out.println("Capacidade maxima: " + capacidadeMaxima + " pessoas");
	}
	
}//fim class
