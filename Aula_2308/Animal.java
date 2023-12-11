package Aula_2308;

public class Animal {// classe pai, superclasse
	//atributos
	public String nome = "Frajola";
	
	//construtor
	public Animal() {
		super();
		System.out.println("o objeto animal acabou de nascer");
	}
	
	//metodos
	public void som() {
		System.out.println("\n som da classe animal");
	}
	public void brincar() {
		System.out.println("brincando . . .");
	}
	public void som1() {
		System.out.println("\n som1 da classe animal");
	}
}
