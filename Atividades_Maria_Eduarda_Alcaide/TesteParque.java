package Atividades_Maria_Eduarda_Alcaide;

public class TesteParque {
	public static void main (String[]args) {
		//visitantes
		Visitante vis1 = new Visitante("Alex", 12 , 1.57);
		System.out.println(vis1.getNome());
		System.out.println(vis1.getIdade());
		System.out.println(vis1.getAltura());
		vis1.podeAndarNoBrinquedo();

		Visitante vis2 = new Visitante("Veronica", 23 , 1.81);
		System.out.println(vis2.getNome());
		System.out.println(vis2.getIdade());
		System.out.println(vis2.getAltura());
		vis2.podeAndarNoBrinquedo();
		
		
		
		/*
		//brinquedos
		Brinquedo brinq1 = new Brinquedo();
		brinq1.nome = ciclone;
		brinq1.alturaMinima = 1.57;
		brinq1.capacidadeMaxima = 50;
		
		Brinquedo brinq2 = new Brinquedo();
		brinq2.nome = montanhaRussa;
		brinq2.alturaMinima = 162;
		brinq2.capacidadeMaxima = 27;*/
		
		//usuário entrando com info do brinquedo
		/*System.out.println("Insira o nome do brinquedo: ");
		String nome = entrada.next();
		System.out.println("Insira a altura minima do brinquedo: ");
		double alturaMinima= entrada.nextDouble();
		System.out.println("Insira a altura minima do brinquedo: ");
		int capacidadeMaxima = entrada.nextInt();*/
		
	}//fim main
	
}//fim classe
