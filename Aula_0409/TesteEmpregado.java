package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		// instanciando objetos
		Pessoa p1 = new Pessoa ("tenente", "tatani", 42);
		Pessoa p2 = new Pessoa ("chef", "dircola", 73);
		
		Empregado1 emp1 = new Empregado1(25000, p1);
		Empregado1 emp2 = new Empregado1(4800, p2);
		
		System.out.println("cargo: " + p1.getCargo());
		System.out.println("Salario: " + emp2.getSalario());
	}

}
