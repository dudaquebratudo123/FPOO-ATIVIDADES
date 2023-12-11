package Aula_1406;

public class ExArray3 {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Kelvin";
		nomes[1] = "Carla";
		nomes[0] = "Kaique";
		for( String olho : nomes) {
			System.out.println("nome:" + olho + "\n");
		}
	}

}
