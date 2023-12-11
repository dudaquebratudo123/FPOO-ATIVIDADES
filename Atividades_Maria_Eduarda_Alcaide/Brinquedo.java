package Atividades_Maria_Eduarda_Alcaide;

public class Brinquedo {
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	//construtores
	public Brinquedo (String no, double almin, int camax) {
		this.nome = no;
		this.alturaMinima = almin;
		this.capacidadeMaxima = camax;
		System.out.println(no + almin + camax);
	}
	
	public Brinquedo() {
		System.out.println("acabei de nascer");
	}
	
	//metodos nome
	public String getNome() {
		return nome;
	}
	
	public String setNome(String n) {
		return this.nome = n;
	}
	
	//metodos alturaMinima
	public double getAlturaMinima() {
		return alturaMinima;
	}
	
	public double setAlturaMinima() {
		return this.alturaMinima;
	}
	
	//metodos capacidadeMaxima
	public int getcapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	public int setcapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	//metodo exibir info
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Altura Minima: " + alturaMinima);
		System.out.println("Capacidade Maxima: " + capacidadeMaxima);
		
	}
	
}//fim class
