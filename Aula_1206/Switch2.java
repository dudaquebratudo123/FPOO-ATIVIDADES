package Aula_1206;

public class Switch2 {
	public enum dias {dom, seg, ter}

	public static void main(String[] args) {
		dias[] diasHoje = dias.values();
		for (dias agora : diasHoje) {
			switch (agora) {
			case dom:
				System.out.println("Domingo");
				break;
				
			case seg:
				System.out.println("Segunda");
				break;
				
			case ter:
				System.out.println("Terca");
				break;

			default:
				System.out.println("Dias não válidos");
				break;
			}
		}
	}

}

// estruturas pra varrer listas = for it
