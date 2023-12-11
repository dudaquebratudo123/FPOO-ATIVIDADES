package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class TestePadaria {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//instancia pao
		System.out.println("________________________________________________________________________________________________________________");
		System.out.println("\nCriando Paes . . . .");
		System.out.println("\nPaozinho 1");
		ProdutoPadaria pao1 = new Pao();
		System.out.println("Tipo:");
		pao1.setNome(entrada.next());
		System.out.println("Preco:");
		pao1.setPreco(entrada.nextDouble());
		
		System.out.println("\nPaozinho 2");
		ProdutoPadaria pao2 = new Pao();
		System.out.println("Tipo:");
		pao2.setNome(entrada.next());
		System.out.println("Preco:");
		pao2.setPreco(entrada.nextDouble());
		
		//exibir
		System.out.println("\nINFORMACOES . . . . . . . . . . . . . . . .  ");
		System.out.println("\n1 -");
		pao1.exibir(null, 0);
		System.out.println("\n2 -");
		pao2.exibir(null, 0);
		
		//instancia doce
		System.out.println("\nCriando doces . . . .");
		System.out.println("\nDocinho 1");
		ProdutoPadaria doce1 = new Doce();
		System.out.println("Tipo:");
		doce1.setNome(entrada.next());
		System.out.println("Preco:");
		doce1.setPreco(entrada.nextDouble());
		
		System.out.println("\nDocinho 2");
		ProdutoPadaria doce2 = new Doce();
		System.out.println("Tipo:");
		doce2.setNome(entrada.next());
		System.out.println("Preco:");
		doce2.setPreco(entrada.nextDouble());
		
		//exibir
		System.out.println("\nINFORMACOES . . . . . . . . . . . . . . . .  ");
		System.out.println("\n1 -");
		doce1.exibir(null, 0);
		System.out.println("\n2 -");
		doce2.exibir(null, 0);
		
		//intancia bolo
		System.out.println("\nCriando bolos . . . .");
		System.out.println("\nBolinho 1");
		ProdutoPadaria bolo1 = new Bolo();
		System.out.println("Tipo:");
		bolo1.setNome(entrada.next());
		System.out.println("Preco:");
		bolo1.setPreco(entrada.nextDouble());
		
		System.out.println("\nDocinho 2");
		ProdutoPadaria bolo2 = new Bolo();
		System.out.println("Tipo:");
		bolo2.setNome(entrada.next());
		System.out.println("Preco:");
		bolo2.setPreco(entrada.nextDouble());
		
		//exibir
		System.out.println("\nINFORMACOES . . . . . . . . . . . . . . . .  ");
		System.out.println("\n1 -");
		bolo1.exibir(null, 0);
		System.out.println("\n2 -");
		bolo2.exibir(null, 0);
		
		//instanciando o batman
		Batman batman = new Batman();
		System.out.println("________________________________________________________________________________________________________________");
		System.out.println("\nInfome qual o nivel de fome do batman:");
		batman.setFome(entrada.next());
		System.out.println("\nBATMAN FOI A PADARIA E ESTAVA COM " + batman.getFome());
		System.out.println("Batman comeu 1 " + pao1.getNome() + ", que custou R$ " + pao1.getPreco());
		System.out.println("Batman comeu 1 " + bolo1.getNome() + ", que custou R$ " + bolo1.getPreco());
		System.out.println("Batman comeu 1 " + doce1.getNome() + ", que custou R$ " + doce1.getPreco());
		System.out.println("Batman comeu 1 " + doce2.getNome() + ", que custou R$ " + doce2.getPreco());
		System.out.println("________________________________________________________________________________________________________________");
		
		//fazendo um bolo
		System.out.println("\nCOLOCANDO A MAO NA MASSA.......");
		System.out.println("\nOpcoes: \n1- Bolo \n2- Pao \n3- Doce");
		System.out.println("\nQUAL RECEITA VOCE DESEJA FAZER?");
		
		int receita = entrada.nextInt();
		switch (receita) {
		
			case (1):
				System.out.println("\nAdicione: \n- Farinha \n- Ovo \n- Manteiga \n- Leite \n- Fermento \n- Nescau \n- Acucar  ");
				break;
				
			case (2):
				System.out.println("\nAdicione: \n- Farinha \n- Ovo \n- Agua \n- Fermento biologico \n- Sal \n- Acucar");
				break;
				
			case (3):
				System.out.println("\nOpcoes: \n1- Brigadeiro \n2- Beijinho ");
				System.out.println("\nQUAL DOCE DESEJA FAZER?");
				int doces = entrada.nextInt();
				switch(doces) {
				case (1) :
					System.out.println("\nAdicione: \n- Leite Condensado \n- Chocolate em po \n- Manteiga");	
					break;
				
				case (2) :
					System.out.println("\nAdicione: \n- Coco ralado \n- Manteiga \n- Leite condensado ");
					break;
					
				}
				
			default:
				System.out.println("Nenhuma receita valida");
				break;
		}
		
		
	}//fim main
	
}//fim classe
