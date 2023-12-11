package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//bike speed
		SpeedBike SB1 = new SpeedBike();
		SpeedBike SB2 = new SpeedBike();
		
		//mountain bike
		MountainBike MT1 = new MountainBike();
		MountainBike MT2 = new MountainBike();
		
		//Pessoa que vai andar na bike
		PessoaBike pes1 = new PessoaBike();
		System.out.println ("NOME DO BIKER 1 . . . . . .");
		pes1.setNome(entrada.nextLine());
		System.out.println("Tipo de bike: ");
		pes1.setTipoBike(entrada.nextLine());
		System.out.println("Marcha atual: ");
		SB1.setMarcha(entrada.nextInt());
		pes1.SubirNaBike();
		SB1.mudarMarchaMais(SB1.getMarcha());
		SB1.acelerar();
		SB1.mudarMarchaMenos(SB1.getMarcha());
		SB1.frear();
		pes1.DescerDaBike();
		
		PessoaBike pes2 = new PessoaBike();
		System.out.println ("\nNOME DO BIKER 2 . . . . . .");
		pes2.setNome(entrada.next());
		System.out.println("Tipo de bike: ");
		pes2.setTipoBike(entrada.next());
		System.out.println("Marcha atual: ");
		MT1.setMarcha(entrada.nextInt());
		pes2.SubirNaBike();
		MT1.mudarMarchaMais(MT1.getMarcha());
		MT1.mudarMarchaMenos(MT1.getMarcha());
		MT1.acelerar();
		MT1.frear();
		pes2.DescerDaBike();

		
		
	}//fim main

}//fim classe
