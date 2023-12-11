package Aula_3008;

public class UsoInterface implements InterfacePai {
	//atributos
	public String at1;

	@Override
	public void metodo1() {
		System.out.println("metodo 1 . . . ");
	}

	@Override
	public void metodo2() {
		System.out.println("metodo 2 . . . ");
	}

	@Override
	public void somar(int x1, int x2) {
		System.out.println("somar " + x1 + " + " + x2 + " = " + (x1 + x2));
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("multiplicar " + a + " + " + b + " = " + (a + b));
	}
	
}
