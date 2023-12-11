package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
		//instancia de objetos da classe animal
		System.out.println("-------INICIO ANIMAL-------");
		Animal animal1 = new Animal();
		animal1.nome = "Pica pau";
		System.out.println("animal criado: " + animal1.nome);
		
		//instancia de objetos da classe animal
		System.out.println("------- FIM ANIMAL-------");
		
		System.out.println("-------INICIO GATO 1-------");
		Gato gatin1 = new Gato();
		gatin1.nome = "Pandora";
		System.out.println("Nome: " + gatin1.nome);
		gatin1.brincar();
		System.out.println("-------FIM GATO 1-------");
		
		System.out.println("-------INICIO GATO 2-------");
		Gato gatin2 = new Gato("Malhado");
		gatin2.som();
		gatin2.som1();
		
		System.out.println("-------INICIO GATO 3-------");
		Gato gatin3 = new Gato(2.5f, 1);
		System.out.println("-------FIM GATO 3-------");
		

	}

}
