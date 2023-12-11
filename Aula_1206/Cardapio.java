package Aula_1206;

public class Cardapio {
	public static void main(String[] args) {
		int cardapio = 1;
		
		switch (cardapio) {
			case (1):
				System.out.println("Pastel");
				break;
			
			case (2):
				System.out.println("Caldo de cana");
				break;
	
			case (3):
				System.out.println("Pudim");
				break;
				
			default:
				System.out.println("Nao disponivel");
				break;
		}
	}
}
