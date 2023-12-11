package Aula_2308;

public class Gato extends Animal{//herança
	//atributos
	public String raca;
	public float peso;
	public int idade;
	
	//costrutor
	public Gato() {
		super();//acessa a superclasse
		System.out.println("\nacabei de nascer e sou um gato sem caracteristicas");
	}
	public Gato(String raca) {//construtor com parâmetros
		super();
		this.raca = raca;
		System.out.println("\n acabei de nascer e sou um gato da raca: " + this.raca);
	}
	public Gato(float peso, int idade) {//com parametro
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println("\n acabei de nascer e sou um gato com" + this.peso + " Kg"
				+ " e" + this.idade + " anos de idade");
	}
	
	//metodos
	public void som() {
		System.out.println("\nsom da classe gato");
		//super.som();// som da classe aimal, nao do gato
		
	}
}
