package Aula_2308;

public class Cachoror extends Animal1{
	//construtor - molde para instanciar objetos com atributos ja criados
	public Cachoror(String nome) {
		super(nome);//pegando atributo nome da superclasse Animal1
	}
	@Override // sobrescrita
	public void emitirSom() {
		System.out.println("O cachorro esta latindo . . . ");
	}
	public void mover() {
		System.out.println("O cachorro esta movendo . . . ");
	}
}
