package Atividades_Maria_Eduarda_Alcaide;

public class TesteCliente {

	public static void main(String[] args) {
		//dando valor aos atributos
		Cliente cliente1 = new Cliente();
		cliente1.cpf = "12345678910";
		cliente1.nome = "Roberto Silva";
		cliente1.telefone = 35832932;
		cliente1.idade = 37;
		cliente1.altura = (double) 1.55;
		cliente1.peso = (double) 68.5;
		
		//chamando metodos
		cliente1.CalcularImc(68.5, 1.55);
		cliente1.CalcularPesoDesejado(60);
		cliente1.ImprimirDados();
		
		System.out.println("...........................");
		//dando valor aos atributos
		Cliente cliente2 = new Cliente();
		cliente2.cpf = "10987654321";
		cliente2.nome = "Viviane Araujo";
		cliente2.telefone = 35831569;
		cliente2.idade = 29;
		cliente2.altura = (double) 1.81;
		cliente2.peso = (double) 70;
		
		//chamando metodos
		cliente2.CalcularImc(70, 1.81);
		cliente2.CalcularPesoDesejado(70);
		cliente2.ImprimirDados();
	}

}
