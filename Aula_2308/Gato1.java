package Aula_2308;

public class Gato1 extends Animal1{
	
	public Gato1(String nome) {
		super(nome);
	}
	@Override //sobrescrita de metodo
	public void emitirSom() {
		System.out.println("O gato está miando . . . ");
	}
}
