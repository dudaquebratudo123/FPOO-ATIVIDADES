package Aula_0409;

public class TesteCao {

	public static void main(String[] args) {
		//instanciando objetos
		Cachorro caozinho1 = new Cachorro("mel", 15, 'f' , 3);
		Cachorro caozinho2 = new Cachorro("vitoria", 10, 'f' , 4);
		Cachorro caozinho3 = new Cachorro("fred", 5, 'm' , 2);
		//imprmindo dados
		System.out.println("CACHORRO 1 . . . . .");
		caozinho1.exibirDados();
		System.out.println("\nCACHORRO 2 . . . . .");
		caozinho2.exibirDados();
		System.out.println("\nCACHORRO 3 . . . . .");
		caozinho3.exibirDados();
	}

}
