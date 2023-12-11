package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		//criando banco e empregado
		Banco b1 = new Banco("jau");
		Empregado e1 = new Empregado("junin");
		System.out.println("O " + e1.getNome() + " e empregado do banco " + b1.getNome());
	}

}
