package Aula_3008;

public class TesteInterface {

	public static void main(String[] args) {
		// instancia de objs (nao posso instanciar de interface, sim de classes)
		InterfacePai obj = new UsoInterface();
		obj.metodo1();
		obj.metodo2();
		obj.somar(21, 15);
		obj.multiplicar(72, 5);
		

	}

}
