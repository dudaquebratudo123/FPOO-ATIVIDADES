package Aula_1406;

public class ArrayList1 {
	
	public static void main (String[] args) {
		java.util.List<String> nomes = new java.util.ArrayList<String>();
		nomes.add("Jose");
		nomes.add("Ana");
		
		for(String olho: nomes) {
			System.out.println(olho);
		};
	}
}
